package com.loiane.cursojava.aula34.labs.exer1;

public class TesteContador {
    public static void main(String[] args) {
        Contador count = new Contador();
        Contador.printarContador();

        Contador count1 = new Contador();
        Contador.printarContador();

        Contador count2 = new Contador();
        Contador.printarContador();
        Contador.incrementarContador();
        Contador.incrementarContador();
        Contador.incrementarContador();
        Contador.incrementarContador();
        Contador.incrementarContador();

        Contador.zerarContador();

        Contador count3 = new Contador();
        Contador.printarContador();

    }
}
