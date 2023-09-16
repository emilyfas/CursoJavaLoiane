package com.loiane.cursojava.aula29;

public class Carro {
    String marca;
    String modelo;
    int numPassageiros;
    double capCombustivel;
    double consumoCombustivel; // litros por km

    Carro(){
        System.out.println("Classe Carro instanciada");
        numPassageiros = 4;
    }

    Carro(String marca_, String modelo_, double consumoCombustivel_){
        marca = marca_;
        modelo = modelo_;
        consumoCombustivel = consumoCombustivel_;
    }

    void exibirAutonomia(){
        double autonomia = capCombustivel * consumoCombustivel;
        System.out.println("A autonomia do carro é: " + autonomia + " km");
    }

    double obterAutonomia(){
        return capCombustivel * consumoCombustivel;
    }

    double calcularCombustivel(double km){
        return km / consumoCombustivel;
    }

}
