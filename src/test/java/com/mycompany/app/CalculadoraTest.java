package com.mycompany.app;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

public class CalculadoraTest {
    @Test
    void testDividir() throws Exception {
        Calculadora cut = new Calculadora();
        double resultado = cut.dividir(10, 5);
        assertEquals(2, resultado);

    }

    @Test
    void testDividirAMemoria() throws Exception {
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
    void testMultiplicarAMemoria() {
        Calculadora cut = new Calculadora();
        double resultado = cut.multiplicar(10, 5);
        resultado = cut.multiplicar(2);
        resultado = cut.multiplicar(3);
        assertEquals(300, resultado);
    }

    @Test
    void testRestar() {
        Calculadora calculadora = new Calculadora();
        double resultadoSuma = calculadora.restar(34, 5.5);
        assertEquals(28.5, resultadoSuma);
    }

    @Test
    void testRestarAMemoria() {
        Calculadora calculadora = new Calculadora();
        double resultadoResta = calculadora.restar(-9);
        resultadoResta = calculadora.restar(5);
        resultadoResta = calculadora.restar(5);
        assertEquals(-1, resultadoResta);

    }

    @Test
    void testSumar() {
        Calculadora calculadora = new Calculadora();
        double resultadoSuma = calculadora.sumar(34, 5.5);
        assertEquals(39.5, resultadoSuma);
    }

    @Test
    void testSumarAMemoria() {
        Calculadora calculadora = new Calculadora();
        double resultado = calculadora.sumar(8);
        resultado = calculadora.sumar(22);
        resultado = calculadora.sumar(22);
        assertEquals(52, resultado);
    }

    @Test
    void testDivisorCero() throws Exception {
        Calculadora cut = new Calculadora();
        assertThrows(Exception.class, () -> cut.dividir(10, 0));
        cut.sumar(1, 5);
        assertThrows(Exception.class, () -> cut.dividir(0));

    }

    @Test
    void testBorrarMemoria () {
        Calculadora cut = new Calculadora();
        assertEquals(0, cut.getMemoria());
        cut.sumar(4, 16);
        cut.multiplicar(3);
        assertEquals(60, cut.getMemoria());
    }
}
