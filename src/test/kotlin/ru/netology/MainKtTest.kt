package ru.netology

import org.junit.Test

import org.junit.Assert.*

class MainKtTest {

    @Test
    fun commissionCalculation_Mastercard_Maestro_Sumall_smaller75() {
        val card = "Mastercard"
        val all = 0
        val now = 80_000_00

        val result = commissionCalculation(
            cardType = card,
            sumAll = all,
            sumNow = now
        )
        assertEquals(0, result)
    }

    @Test
    fun commissionCalculation_Mastercard_Maestro_Sumall_more75() {
        val card = "Mastercard"
        val all = 75_000_00
        val now = 80_000_00

        val result = commissionCalculation(
            cardType = card,
            sumAll = all,
            sumNow = now
        )
        assertEquals(482000, result)
    }

    @Test
    fun commissionCalculation_VKPay() {
        val card = "VKPay"
        val all = 0
        val now = 80_000_00

        val result = commissionCalculation(
            cardType = card,
            sumAll = all,
            sumNow = now
        )
        assertEquals(0, result)
    }

    @Test
    fun commissionCalculation_Visa_Mir_comission_smaller35() {
        val card = "Visa"
        val all = 0
        val now = 80

        val result = commissionCalculation(
            cardType = card,
            sumAll = all,
            sumNow = now
        )
        assertEquals(3500, result)
    }

    @Test
    fun commissionCalculation_Visa_Mir_comission_more35() {
        val card = "Visa"
        val all = 0
        val now = 80_000_00

        val result = commissionCalculation(
            cardType = card,
            sumAll = all,
            sumNow = now
        )
        assertEquals(600000, result)
    }
}