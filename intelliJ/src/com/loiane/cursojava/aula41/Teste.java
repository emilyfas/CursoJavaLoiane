package com.loiane.cursojava.aula41;

public class Teste {
    public static void main(String[] args) {
        // Não podemos instanciar como uma classe abstrata
        // Pessoa pessoa = new Pessoa();
        Pessoa aluno = new Aluno();
        Pessoa prof = new Professor();

        // pessoa.setEndereco("Rua alta, num 89");
        aluno.setEndereco("Rua baixa, num 9");
        prof.setEndereco("Rua media, num 8");

        aluno.imprimirEtiquetaEndereco();
        prof.imprimirEtiquetaEndereco();
    }
}
