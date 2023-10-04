package com.loiane.cursojava.aula46.labs.exer2;

public class Piramide extends Figura3D {

    private double lado;
    private double altura;

    public Piramide(double lado, double altura) {
        this.lado = lado;
        this.altura = altura;
    }

    public Piramide() {
    }

    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    @Override
    public double calcularArea() {
        return (lado * lado) + (2 * lado * altura);
    }

    @Override
    public double calcularVolume() {
        return (((double) 1/3) * (lado * lado)) * altura;
    }
}
