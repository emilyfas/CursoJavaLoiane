package com.loiane.cursojava.aula41.exAnimais;

public class Teste {
    public static void main(String[] args) {
        Ave papagaio = new Papagaio();
        Mamifero cachorro = new Cachorro();

        papagaio.setNome("Filu");
        cachorro.setNome("Lufi");

        System.out.println(papagaio.getNome());
        System.out.println(papagaio.emitirSom());

        System.out.println(cachorro.getNome());
        System.out.println(cachorro.emitirSom());
    }
}
