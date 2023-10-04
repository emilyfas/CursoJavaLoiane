package com.loiane.cursojava.aula33.labs.exer2;

public class ContaCorrente {
    private int numero;
    private double saldo;
    private boolean especial;
    private double limite;
    
    public ContaCorrente(){ }

    public ContaCorrente(int numero, double saldo, boolean especial, double limite) {
        this.numero = numero;
        this.saldo = saldo;
        this.especial = especial;
        this.limite = limite;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public boolean isEspecial() {
        return especial;
    }

    public void setEspecial(boolean especial) {
        this.especial = especial;
    }

    public double getLimite() {
        return limite;
    }

    public void setLimite(double limite) {
        this.limite = limite;
    }

    public String consultarSaldo(){
        return "Saldo atual: "+this.getSaldo();
    }

    public void realizarSaque(double valorSaque){
         if (valorSaque <= this.saldo){
             this.saldo -= valorSaque;
            System.out.println("Saque realizado com sucesso!\n"+consultarSaldo());
        } else{
            if(especial){
                if (this.limite + this.saldo < valorSaque){
                    System.out.println("Saldo insuficiente e limite do cheque especial excedido");
                }else{
                    this.saldo -= valorSaque;
                    System.out.println("Saque realizado com sucesso!\n"+consultarSaldo());
                }
            }else{
                System.out.println("Falha na trasação! Saldo insuficiente.");
            }
        }
    }

    public void realizarDeposito(double valorDeposito) {
        this.saldo += valorDeposito;
        System.out.println("Deposito realizado com sucesso!\n"+consultarSaldo());
    }
    public void consultarChequeEspecial(){
        if (!isEspecial()){
            System.out.println("Conta não recebe o beneficio do cheque especial.");
        }else if (this.saldo < 0){
            System.out.println("Voce é contemplado com a conta especial!\nVoce esta usando o cheque especial!\n"+consultarSaldo());

        }else if (this.saldo > 0){
            System.out.println("Voce é contemplado com a conta especial!\nVoce não esta usando o cheque especial!\n"+consultarSaldo());
        }
    }
}
