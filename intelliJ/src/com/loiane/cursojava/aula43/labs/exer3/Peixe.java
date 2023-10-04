package com.loiane.cursojava.aula43.labs.exer3;

import java.util.Arrays;

public class Peixe extends Animal{

    private String[] caracteristicas;

    public Peixe(String nome, double comprimento, int patas, String cor, String ambiente, double velocidade, String[] caracteristicas) {
        super(nome, comprimento, patas, cor, ambiente, velocidade);
        this.caracteristicas = caracteristicas;
    }

    public Peixe(String nome, double comprimento, double velocidade) {
        super(nome, comprimento, 0, "Cinzenta", "Mar", velocidade);
        this.caracteristicas = new String[]{"Barbatanas", "Cauda"};
    }

    public String[] getCaracteristicas() {
        return caracteristicas;
    }

    public void setCaracteristicas(String[] caracteristicas) {
        this.caracteristicas = caracteristicas;
    }

    @Override
    public void printarInfosAnimal() {
        String text = this.toString();
        text += "Caracteristicas: " + Arrays.toString(caracteristicas);
        System.out.println(text);
    }
}
