package com.loiane.cursojava.aula27;


public class TestCarro {

    public static void main(String[] args) {

        Carro van = new Carro();

        van.marca = "Fiat";
        van.modelo = "seila";
        van.consumoCombustivel = 15;
        van.capCombustivel = 20.5;
        van.numPassageiros = 4;

        Carro fusca = new Carro();

        fusca.marca = "Fiat";
        fusca.modelo = "seila";
        fusca.consumoCombustivel = 10;
        fusca.capCombustivel = 10.5;
        fusca.numPassageiros = 4;

        System.out.println(van.marca);
        System.out.println(fusca.marca);

        System.out.println(van.calcularCombustivel(34));
        System.out.println(fusca.calcularCombustivel(56));
    }
}
