package com.loiane.cursojava.aula27.labs.exer2;

public class TesteContaCorrente {
    public static void main(String[] args) {
        ContaCorrente bradesco = new ContaCorrente();

        bradesco.limite = 100;
        bradesco.numero = 67641;
        bradesco.saldo = 200;
        bradesco.especial = true;
        bradesco.valorEspecialUsado = 0;

        bradesco.consultarSaldo();
        bradesco.realizarSaque(301);
        bradesco.realizarDeposito(12);
        bradesco.consultarChequeEspecial();

        ContaCorrente santander = new ContaCorrente();

        santander.limite = 250;
        santander.numero = 6721;
        santander.saldo = 12.56;
        santander.especial = false;
        santander.valorEspecialUsado = 0;

        /*
        santander.consultarSaldo();
        santander.realizarSaque(12);
        santander.realizarDeposito(1);
        santander.consultarChequeEspecial();
        */

    }
}
