package com.loiane.cursojava.aula33.labs.exer2;

public class TesteContaCorrente {
    public static void main(String[] args) {
        ContaCorrente bradesco = new ContaCorrente();

        bradesco.setLimite(200);
        bradesco.setNumero(161654);
        bradesco.setSaldo(156);
        bradesco.setEspecial(true);

        bradesco.consultarSaldo();
        bradesco.realizarSaque(301);
        bradesco.realizarDeposito(12);
        bradesco.consultarChequeEspecial();
    }
}
