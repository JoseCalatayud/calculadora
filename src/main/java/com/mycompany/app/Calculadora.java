package com.mycompany.app;

public class Calculadora {
    private double resultadoEnMemoria;

    public Calculadora() {
        this.resultadoEnMemoria = 0;
    }

    public double sumar(double numero1, double numero2) {
        return numero1 + numero2;
    }

    public double sumarAMemoria(double numero) {
        return numero + this.resultadoEnMemoria;
    }

    public double restar(double numero1, double numero2) {
        return numero1 - numero2;
    }

    public double restarAMemoria( double numero){
        return this.resultadoEnMemoria - numero;
    }

    public double dividir ( double numero1, double numero2) throws Exception {
        return numero1 / numero2;
    }

    public double dividirAMemoria(double numero){
        return this.resultadoEnMemoria / numero;
    }

    public double multiplicar ( double numero1, double numero2){
        return numero1 * numero2;
    }

    public double multiplicarAMemoria(double numero){
        return this.resultadoEnMemoria * numero;
    }

    public double getResultadoEnMemoria() {
        return resultadoEnMemoria;
    }

}
