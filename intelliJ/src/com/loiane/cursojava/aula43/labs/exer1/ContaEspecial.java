package com.loiane.cursojava.aula43.labs.exer1;

public class ContaEspecial extends ContaBancaria{
    private double limite;

    public double getLimite() {
        return limite;
    }

    public void setLimite(double limite) {
        this.limite = limite;
    }

    @Override
    public void sacar(int valor) {
        double saldoCredito = limite + getSaldo();
        if(saldoCredito<valor){
            System.out.println("Saldo Insuficiente! Limite de Credito Atingido!");
            return;
        }
        setSaldo(getSaldo() - valor);
        printarSaldo();
    }

    @Override
    public String toString() {
        return "ContaEspecial{" +
                "limite=" + limite +
                '}';
    }
}
