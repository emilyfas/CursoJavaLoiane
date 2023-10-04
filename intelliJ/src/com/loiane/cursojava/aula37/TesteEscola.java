package com.loiane.cursojava.aula37;

public class TesteEscola {
    public static void main(String[] args) {
        /*
        Aluno aluno = new Aluno();
        Professor prof = new Professor();

        aluno.setNome("Emilly");
        System.out.println(aluno.getNome());

        prof.setNome("Loiane");
        System.out.println(prof.getNome());

        prof.setTelefoneCelular("65464656");
        */

        // Pessoa é uma super classe
        // recebe somente os metodos e atributos da classe Pessoa
        Pessoa aluno = new Aluno();

        Pessoa prof = new Professor();
        // prof.getSalario;
        // Erro pois não temos acesso aos atributos da clase Professor
    }
}
