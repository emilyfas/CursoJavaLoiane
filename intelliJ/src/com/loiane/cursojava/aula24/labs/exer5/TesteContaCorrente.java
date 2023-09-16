package com.loiane.cursojava.aula24.labs.exer5;

public class TesteContaCorrente {
    public static void main(String[] args) {
        ContaCorrente bradesco = new ContaCorrente();

        bradesco.limite = 1500;
        bradesco.numero = 67641;
        bradesco.saldo = 152.56;
        bradesco.status = "Especial";
    }
}
