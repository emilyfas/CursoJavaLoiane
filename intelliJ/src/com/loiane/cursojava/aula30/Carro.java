package com.loiane.cursojava.aula30;

public class Carro {
    String marca;
    String modelo;
    int numPassageiros;
    double capCombustivel;
    double consumoCombustivel; // litros por km

    public Carro(String marca, String modelo, int numPassageiros, double capCombustivel, double consumoCombustivel) {
        this.marca = marca;
        this.modelo = modelo;
        this.numPassageiros = numPassageiros;
        this.capCombustivel = capCombustivel;
        this.consumoCombustivel = consumoCombustivel;
    }

    public Carro(String marca, String modelo, int numPassageiros) {
        this.marca = marca;
        this.modelo = modelo;
        this.numPassageiros = numPassageiros;
        System.out.println("Construtor 3 parametros");
    }

    public Carro(String marca, String modelo) {
        this(marca, modelo, 10);
        System.out.println("Construtor 2 parametros");
    }

    void exibirAutonomia(){
        double autonomia = this.capCombustivel * this.consumoCombustivel;
        System.out.println("A autonomia do carro é: " + autonomia + " km");
    }

    double obterAutonomia(){
        return this.capCombustivel * this.consumoCombustivel;
    }

    double calcularCombustivel(double km){
        return km / this.consumoCombustivel;
    }

}
