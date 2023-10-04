package com.loiane.cursojava.aula46.labs.exer3;

public class Cilindro extends Figura3D {
    private double raio;
    private double altura;

    public Cilindro(double raio, double altura) {
        this.raio = raio;
        this.altura = altura;
    }

    public Cilindro() {
    }

    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    @Override
    public double calcularArea() {
        return 2 * Math.PI * raio * (raio + altura);
    }

    @Override
    public double calcularVolume() {
        return Math.PI * (raio * raio) + altura;
    }

    @Override
    public String toString() {
        return "Cilindro{" +
                "raio=" + raio +
                ", altura=" + altura +
                '}';
    }
}
