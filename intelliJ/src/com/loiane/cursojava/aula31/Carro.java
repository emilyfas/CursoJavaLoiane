package com.loiane.cursojava.aula31;

// Quando classe é "padrão/default" ela só pode ser vista dentro do seu proprio package
// Quando a classe é public pode ser vista de qualquer lugar no projeto
public class Carro {
    // visto por todas as classes pois é public
    public String marca;

    // visto somente por classes neste pacote pois é default
    String modelo;
    int numPassageiros;

    // visto somente nesta classe
    private double consumoCombustivel;
    double capCombustivel; // litros por km

    // public visto em todas as clases
    public void exibirAutonomia(){
        double autonomia = this.capCombustivel * this.consumoCombustivel;
        System.out.println("A autonomia do carro é: " + autonomia + " km");
    }

    // default visto neste pacote
    double obterAutonomia(){
        return this.capCombustivel * this.consumoCombustivel;
    }

    private double divideKMPorConsumo(double km){
        return km/this.consumoCombustivel;
    }

    public double calcularCombustivel(double km){
        return this.divideKMPorConsumo(km);
    }

}
