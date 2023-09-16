package com.loiane.cursojava.aula29;

public class TesteCarro {
    public static void main(String[] args) {
        Carro van = new Carro("Fiat", "seila", 15);

        van.capCombustivel = 20.5;

        System.out.println(van.numPassageiros);
        System.out.println(van.marca);

    }
}
