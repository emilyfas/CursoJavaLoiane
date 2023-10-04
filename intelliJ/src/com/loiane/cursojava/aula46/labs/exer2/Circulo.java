package com.loiane.cursojava.aula46.labs.exer2;

public class Circulo extends Figura2D {

    private double raio;

    public Circulo(double raio) {
        this.raio = raio;
    }

    public Circulo() {
    }

    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }

    @Override
    public double calcularArea() {
        return Math.PI * Math.pow(raio, 2);
    }
}
