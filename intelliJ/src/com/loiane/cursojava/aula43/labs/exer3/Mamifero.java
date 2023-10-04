package com.loiane.cursojava.aula43.labs.exer3;

import java.util.Arrays;

public class Mamifero extends Animal{
    private String alimento;

    public Mamifero(String nome, double comprimento, int patas, String cor, String ambiente, double velocidade, String alimento) {
        super(nome, comprimento, patas, cor, ambiente, velocidade);
        this.alimento = alimento;
    }


    public Mamifero(String nome, double comprimento, int patas, String cor, double velocidade, String alimento) {
        super(nome, comprimento, patas, cor, "Terra", velocidade);
        this.alimento = alimento;
    }

    public String getAlimento() {
        return alimento;
    }

    public void setAlimento(String alimento) {
        this.alimento = alimento;
    }

    @Override
    public void printarInfosAnimal() {
        String text = this.toString();
        text += "Alimento: " + alimento;
        System.out.println(text);
    }
}
