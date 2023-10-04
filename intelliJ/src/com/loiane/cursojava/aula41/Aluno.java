package com.loiane.cursojava.aula41;

public class Aluno extends Pessoa {
    private String[] cursos;
    private double[][] notas;

    public Aluno() {
        super();
    }

    public Aluno(String nome, String endereco, String telefone, String[] cursos, double[][] notas) {
        // super é usado para fazer referencia a super classe, nesse caso a classe Pessoa
        super(nome, endereco, telefone);
        this.cursos = cursos;
        this.notas = notas;
    }

    public String[] getCursos() {
        return cursos;
    }

    public void setCursos(String[] cursos) {
        this.cursos = cursos;
    }

    public double[][] getNotas() {
        return notas;
    }

    public void setNotas(double[][] notas) {
        this.notas = notas;
    }

    public double calcularMedia(){
        return 0;
    }
    public boolean verificarAprovado(){
        return true;
    }

    public void metodoQualquer(){
        // faz referencia a super classe
        super.setCpf("54632198745");

        // faz referencia a esta classe (THIS class)
        this.setCpf("32165498748");
    }

    public String obterEtiquetaEndereco(){
        String s = "Endereço do aluno: ";
        s += this.getEndereco();
        return s;
    }

    @Override
    public void imprimirEtiquetaEndereco() {
        System.out.println(this.obterEtiquetaEndereco());
    }
}
