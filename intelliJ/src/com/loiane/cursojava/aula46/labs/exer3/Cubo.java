package com.loiane.cursojava.aula46.labs.exer3;

public class Cubo extends Figura3D {

    private double altura;

    public Cubo(double altura) {
        this.altura = altura;
    }

    public Cubo() {
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    @Override
    public double calcularArea() {
        return 6 * (altura * altura);
    }

    @Override
    public double calcularVolume() {
        return Math.pow(altura, 3);
    }

    @Override
    public String toString() {
        return "Cubo{" +
                "altura=" + altura +
                '}';
    }
}
