package com.mycompany.app;

public class Calculadora {
    private double resultadoEnMemoria;

    public Calculadora() {
        this.resultadoEnMemoria = 0;
    }

    public double sumar(double numero1, double numero2) throws IllegalArgumentException {
        this.resultadoEnMemoria = numero1 + numero2;
        return resultadoEnMemoria;
    }

    public double sumar(double numero) throws IllegalArgumentException {
        this.resultadoEnMemoria += numero;
        return resultadoEnMemoria;
    }

    public double restar(double numero1, double numero2) throws IllegalArgumentException {
        this.resultadoEnMemoria = numero1 - numero2;
        return resultadoEnMemoria;
    }

    public double restar(double numero) throws IllegalArgumentException {
        this.resultadoEnMemoria -= numero;
        return resultadoEnMemoria;
    }

    public double dividir(double numero1, double numero2) throws Exception, IllegalArgumentException {
        if (numero2 == 0) {
            throw new Exception("El divisor no puede ser 0");
        }
        this.resultadoEnMemoria = numero1 / numero2;
        return resultadoEnMemoria;
    }

    public double dividir(double numero) throws Exception, IllegalArgumentException {
        if (numero == 0) {
            throw new Exception("El divisor no puede ser 0");
        }
        this.resultadoEnMemoria /= numero;
        return resultadoEnMemoria;

    }

    public double multiplicar(double numero1, double numero2) throws IllegalArgumentException {
        this.resultadoEnMemoria = numero1 * numero2;
        return resultadoEnMemoria;
    }

    public double multiplicar(double numero) throws IllegalArgumentException {
        this.resultadoEnMemoria *= numero;
        return resultadoEnMemoria;
    }
    
    public double factorial (double numero){
        this.resultadoEnMemoria = factorialRecursivo(numero);
        return resultadoEnMemoria;
    }

    private double factorialRecursivo (double numero){
        if (numero == 1){
            return 1;
        }
        return numero*factorial(numero - 1);
    }

    public void borrarMemoria() {
        this.resultadoEnMemoria = 0;
    }

    public double getMemoria() {
        return resultadoEnMemoria;
    }
}
