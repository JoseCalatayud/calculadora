package com.mycompany.app;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class CalculadoraTest {
    @Test
    void testDividir() throws Exception {
        Calculadora cut = new Calculadora();
        double resultado = cut.dividir(10, 5);
        assertEquals(2, resultado);

    }

    @Test
    void testDividir_AMemoria() throws Exception {
        Calculadora cut = new Calculadora();
        double resultado = cut.dividir(10, 5);
        resultado = cut.dividir(2);
        resultado = cut.dividir(2);
        assertEquals(0.5, resultado);
    }

    @Test
    void testMultiplicar() {
        Calculadora cut = new Calculadora();
        double resultado = cut.multiplicar(10, 5);
        assertEquals(50, resultado);
    }

    @Test
    void testMultiplicar_AMemoria() {
        Calculadora cut = new Calculadora();
        double resultado = cut.multiplicar(10, 5);
        resultado = cut.multiplicar(2);
        resultado = cut.multiplicar(3);
        assertEquals(300, resultado);
    }

    @Test
    void testRestar() {
        Calculadora cut = new Calculadora();
        double resultadoSuma = cut.restar(34, 5.5);
        assertEquals(28.5, resultadoSuma);
    }

    @Test
    void testRestar_AMemoria() {
        Calculadora cut = new Calculadora();
        double resultadoResta = cut.restar(-9);
        resultadoResta = cut.restar(5);
        resultadoResta = cut.restar(5);
        assertEquals(-1, resultadoResta);

    }

    @Test
    void testSumar() {
        Calculadora cut = new Calculadora();
        double resultadoSuma = cut.sumar(34, 5.5);
        assertEquals(39.5, resultadoSuma);
    }

    @Test
    void testSumar_AMemoria() {
        Calculadora cut = new Calculadora();
        double resultado = cut.sumar(8);
        resultado = cut.sumar(22);
        resultado = cut.sumar(22);
        assertEquals(52, resultado);
    }

    @Test
    void testDividir_DivisorCero() throws Exception {
        Calculadora cut = new Calculadora();
        assertThrows(Exception.class, () -> cut.dividir(10, 0));
        cut.sumar(1, 5);
        assertThrows(Exception.class, () -> cut.dividir(0));

    }

    @Test
    void testBorrarMemoria() {
        Calculadora cut = new Calculadora();
        assertEquals(0, cut.getMemoria());
        cut.sumar(4, 16);
        cut.multiplicar(3);
        assertEquals(60, cut.getMemoria());
        cut.borrarMemoria();
        assertEquals(0, cut.getMemoria());

    }

    @Test
    void testFactorial() {
        Calculadora cut = new Calculadora();
        assertEquals(40320, cut.factorial(8));
    }
}
