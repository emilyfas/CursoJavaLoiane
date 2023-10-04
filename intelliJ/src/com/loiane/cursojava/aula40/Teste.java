package com.loiane.cursojava.aula40;

public class Teste {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();
        Pessoa aluno = new Aluno();
        Pessoa prof = new Professor();

        pessoa.setEndereco("Rua alta, num 89");
        aluno.setEndereco("Rua baixa, num 9");
        prof.setEndereco("Rua media, num 8");

        System.out.println(pessoa.obterEtiquetaEndereco());
        System.out.println(aluno.obterEtiquetaEndereco());
        System.out.println(prof.obterEtiquetaEndereco());
    }
}
