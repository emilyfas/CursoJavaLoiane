package com.loiane.cursojava.aula43.labs.exer1;

import java.util.Objects;

public class ContaBancaria {
    private String nomeCliente;
    private int numConta;
    private double saldo;

    public ContaBancaria() {
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public int getNumConta() {
        return numConta;
    }

    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    protected void printarSaldo(){
        System.out.println("Saldo atual: "+saldo);
    }

    public void sacar(int valor){
        if(saldo - valor < 0){
            System.out.println("Saldo Induficiente!");
            return;
        }
        saldo -= valor;
        printarSaldo();
    }

    public void depositar(int valor){
        saldo += valor;
        printarSaldo();
    }

    @Override
    public String toString() {
        return "ContaBancaria{" +
                "nomeCliente='" + nomeCliente + '\'' +
                ", numConta=" + numConta +
                ", saldo=" + saldo +
                '}';
    }
}
