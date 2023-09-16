package com.loiane.cursojava.aula30;

public class TesteCarro {
    public static void main(String[] args) {
        // Carro van = new Carro("Fiat", "seila", 10, 12, 10);
        Carro van = new Carro("Fiat", "seila");

        System.out.println(van.numPassageiros);
        System.out.println(van.marca);
    }
}
