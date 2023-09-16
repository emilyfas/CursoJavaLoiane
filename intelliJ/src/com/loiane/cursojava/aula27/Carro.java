package com.loiane.cursojava.aula27;

public class Carro {
    String marca;
    String modelo;
    int numPassageiros;
    double capCombustivel;
    double consumoCombustivel; // litros por km

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
