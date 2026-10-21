package com.senai;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class CalcPotenciaTest {
    @Test 
    public void testarPotencia() {
        CalcPotencia calc = new CalcPotencia();
        double resultado = calc.calcularPotencia(220, 5);
        assertEquals(1100, resultado, 0.01);
    }
}
