package com.loiane.cursojava.aula36.labs.exer2;

public class Aluno {
    private String nome;
    private String matricula;
    private int[] notas = new int[4];

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public int[] getNotas() {
        return notas;
    }

    public void setNotas(int[] notas) {
        this.notas = notas;
    }

    public int getUmaNota(int i) {
        return notas[i];
    }
}
