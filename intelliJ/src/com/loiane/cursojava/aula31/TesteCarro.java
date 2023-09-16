package com.loiane.cursojava.aula31;

public class TesteCarro {
    public static void main(String[] args) {
        // Carro van = new Carro("Fiat", "seila", 10, 12, 10);
        Carro van = new Carro();

        // Erro pois var é private
        // van.consumoCombustivel = 12;

        van.calcularCombustivel(12);

        System.out.println(van.numPassageiros);
        System.out.println(van.marca);
    }
}
