package com.loiane.cursojava.aula46.labs.exer2;

public class Quadrado extends Figura2D {

    private double lado;

    public Quadrado(double lado) {
        this.lado = lado;
    }

    public Quadrado() {
    }

    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }

    @Override
    public double calcularArea() {
        return lado * lado;
    }
}
