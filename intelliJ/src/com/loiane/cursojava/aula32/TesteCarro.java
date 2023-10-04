package com.loiane.cursojava.aula32;

// Encapsulamento
// Não se expõe os atributos para as classes, por isso usamos os gets e sets.
// Isso é chamado de encapsulamento

public class TesteCarro {
    public static void main(String[] args) {
        Carro van = new Carro();

        // por convenção atributos são private, não é possivel adicionar valor diretamente
        // van.marca = "Fiat";

        // Assim são atribuidos os valores
        van.setMarca("Fiat");
        van.setModelo("Uno");
        van.setNumPassageiros(4);

        System.out.println(van.getMarca() + ", " + van.getModelo() + ", " + van.getNumPassageiros());
    }
}
