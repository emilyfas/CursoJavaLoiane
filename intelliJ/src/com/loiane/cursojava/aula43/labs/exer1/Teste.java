package com.loiane.cursojava.aula43.labs.exer1;

public class Teste {
    public static void main(String[] args) {

        ContaBancaria contaNormal = new ContaBancaria();
        contaNormal.setNumConta(6540);
        contaNormal.setNomeCliente("Maria");
        contaNormal.setSaldo(200);

        ContaEspecial contaCredito = new ContaEspecial();
        contaCredito.setNomeCliente("Joao");
        contaCredito.setNumConta(65478);
        contaCredito.setSaldo(100);
        contaCredito.setLimite(200);

        ContaPoupanca contaPoupanca = new ContaPoupanca();
        contaPoupanca.setNumConta(65421);
        contaPoupanca.setNomeCliente("majjo");
        contaPoupanca.setSaldo(500);
        contaPoupanca.setDiaRendimento(1);

        separator();
        System.out.println("Conta Normal");
        contaNormal.sacar(100);
        contaNormal.depositar(20);
        contaNormal.sacar(300);

        separator();
        System.out.println("Conta Credito");
        contaCredito.sacar(100);
        contaCredito.sacar(300);

        separator();
        System.out.println("Conta Poupança");
        contaPoupanca.calcularNovoSaldo();
        contaPoupanca.calcularNovoSaldo();
        contaPoupanca.calcularNovoSaldo();

        separator();
    }

    static void separator(){
        System.out.println("-----------------------------");
    }
}
