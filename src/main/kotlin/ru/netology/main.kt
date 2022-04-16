package ru.netology

var sumAllCache = 0;

fun main() {
    println(commissionCalculation(sumNow = 80_000_00))
    println(commissionCalculation("Mastercard", sumAllCache, 90_000_00))
    println(commissionCalculation("Maestro", sumAllCache, 50_000_00))
    println(commissionCalculation(cardType = "Visa", sumNow = 300_00))
    println(commissionCalculation(cardType = "Mir", sumNow = 500_000_00))

}

fun commissionCalculation(cardType: String = "VKPay", sumAll: Int = 0, sumNow: Int): Int {

    return when(cardType) {
        "Mastercard", "Maestro" -> {
            sumAllCache += sumNow;
            if(sumAll < 75_000_00) {
                0
            } else {
                val commis: Double = sumNow * 0.06 + 20_00
                commis.toInt()
            }
        }
        "Visa", "Mir" -> {
            val commis = sumNow * 0.075
            if(commis < 35_00) {
                35_00
            } else {
                commis.toInt()
            }
        }
        else -> 0
    }
}