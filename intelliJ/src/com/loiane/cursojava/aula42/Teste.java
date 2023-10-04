package com.loiane.cursojava.aula42;

public class Teste {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();
//        Pessoa aluno = new Aluno();
//        Pessoa prof = new Professor();
        Pessoa aluno = new Pessoa();
        Pessoa prof = new Pessoa();

        System.out.println(Constantes.URL_BLOG);
        // Não é possivel alterar pois a variavel é final (é uma constante)
        // Constantes.URL_BLOG = "novourl.com";
        System.out.println(Constantes.URL_CURSO_COMPLETO);

    }
}
