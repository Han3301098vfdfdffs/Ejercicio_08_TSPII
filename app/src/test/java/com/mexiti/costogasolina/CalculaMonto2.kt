package com.mexiti.costogasolina

import org.junit.Assert.assertEquals
import org.junit.Test
import java.text.NumberFormat

class CalculaMonto2 {

    @Test
    fun calcularMonto2(){

        val precio = 22.35
        val cantLitros = 40.0
        val darPropina = false
        val propina = 0.0

        val montoEsperado = NumberFormat.getCurrencyInstance().format(894.0)
        val montoActual = calcularMonto(precio,cantLitros,darPropina = darPropina, propina = propina)

        assertEquals(montoEsperado,montoActual)
    }
}