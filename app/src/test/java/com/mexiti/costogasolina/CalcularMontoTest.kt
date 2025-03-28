package com.mexiti.costogasolina

import org.junit.Assert.assertEquals
import org.junit.Test
import java.text.NumberFormat

class CalcularMontoTest {

    @Test
    fun calcularMonto20l_24_95(){

        val precio = 24.95
        val cantLitros = 20.0
        val darPropina = false
        val propina = 0.0

        val montoEsperado = NumberFormat.getCurrencyInstance().format(499.0)
        val montoActual = calcularMonto(precio,cantLitros,darPropina = darPropina, propina = propina)

        assertEquals(montoEsperado,montoActual)
    }
}