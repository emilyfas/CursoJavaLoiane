package com.loiane.cursojava.aula43.labs.exer2;

public class Teste {
    public static void main(String[] args) {
        PessoaJuridica pj = new PessoaJuridica("Joao", 1000);
        PessoaFisica pf = new PessoaFisica("Maria", 1200);

        pj.calcularImposto();
        pf.calcularAliquota();
        pf.calcularImposto();

        PessoaJuridica pj2 = new PessoaJuridica("Mateus", 2000);
        PessoaFisica pf2 = new PessoaFisica("Marcos", 2000);

        pj2.calcularImposto();
        pf2.calcularAliquota();
        pf2.calcularImposto();

        PessoaJuridica pj3 = new PessoaJuridica("Joao", 1500);
        PessoaFisica pf3 = new PessoaFisica("Lucas", 3000);

        pj3.calcularImposto();
        pf3.calcularAliquota();
        pf3.calcularImposto();
    }
}
