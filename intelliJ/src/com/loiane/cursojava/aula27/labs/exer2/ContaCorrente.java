package com.loiane.cursojava.aula27.labs.exer2;

public class ContaCorrente {
    int numero;
    double saldo;
    boolean especial;
    double limite;
    double valorEspecialUsado;

    String consultarSaldo(){
        return "Saldo atual: "+saldo;
    }

    void realizarSaque(double valorSaque){
         if (valorSaque <= saldo){
            saldo -= valorSaque;
            System.out.println("Saque realizado com sucesso!\n"+consultarSaldo());
        } else{
            if(especial){
                if (limite + saldo < valorSaque){
                    System.out.println("Saldo insuficiente e limite do cheque especial excedido");
                }else{
                    saldo -= valorSaque;
                    System.out.println("Saque realizado com sucesso!\n"+consultarSaldo());
                }
            }else{
                System.out.println("Falha na trasação! Saldo insuficiente.");
            }
        }
    }

    void realizarDeposito(double valorDeposito) {
        saldo += valorDeposito;
        System.out.println("Deposito realizado com sucesso!\n"+consultarSaldo());
    }
    void consultarChequeEspecial(){
        if (!especial){
            System.out.println("Conta não recebe o beneficio do cheque especial.");
        }else if (saldo < 0){
            System.out.println("Voce é contemplado com a conta especial!\nVoce esta usando o cheque especial!\n"+consultarSaldo());

        }else if (saldo > 0){
            System.out.println("Voce é contemplado com a conta especial!\nVoce não esta usando o cheque especial!\n"+consultarSaldo());
        }
    }
}
