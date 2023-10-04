
package com.loiane.cursojava.aula43;

import java.util.Arrays;
import java.util.Objects;

public class Aluno {
    private String curso;
    private double[] notas;

    public Aluno() {
        super();
    }

    public Aluno(String nome, String endereco, String telefone, String curso, double[] notas) {
        // super é usado para fazer referencia a super classe, nesse caso a classe Pessoa
        //super(nome, endereco, telefone);
        this.curso = curso;
        this.notas = notas;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public double[] getNotas() {
        return notas;
    }

    public void setNotas(double[] notas) {
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
        //super.setCpf("54632198745");

        // faz referencia a esta classe (THIS class)
        //this.setCpf("32165498748");
    }

    public String obterEtiquetaEndereco(){
        String s = "Endereço do aluno: ";
        //s += this.getEndereco();
        return s;
    }

    // @Override
    public void imprimirEtiquetaEndereco() {
        System.out.println(this.obterEtiquetaEndereco());
    }

    /*
        public String toString(){
            String s = curso + "\n";
            for (double nota : notas) {
                s += nota + " ";
            }
            return s;
        }
    */

    // Gerado automaticamente pela IDE atraves do 'generate'
    @Override
    public String toString() {
        return "Aluno{" +
                "curso='" + curso + '\'' +
                ", notas=" + Arrays.toString(notas) +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Aluno aluno = (Aluno) o;
        return curso.equalsIgnoreCase(((Aluno) o).getCurso());
    }
}
