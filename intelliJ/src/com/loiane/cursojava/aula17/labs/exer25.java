package com.loiane.cursojava.aula17.labs;

import java.util.Scanner;

public class exer25 {

    public static void main(String[] args) {

        //O Sr. Manoel Joaquim expandiu seus negócios para além dos
        //negócios de 1,99 e agora possui uma loja de conveniências. Faça um
        //programa que implemente uma caixa registradora rudimentar. O
        //programa deverá receber um número desconhecido de valores
        //referentes aos preços das mercadorias. Um valor zero deve ser
        //informado pelo operador para indicar o final da compra. O programa
        //deve então mostrar o total da compra e perguntar o valor em dinheiro
        //que o cliente forneceu, para então calcular e mostrar o valor do troco.
        //Após esta operação, o programa deverá voltar ao ponto inicial, para
        //registrar a próxima compra. A saída deve ser conforme o exemplo
        //abaixo:

        //o Lojas Tabajara
        //o Produto 1: R$ 2.20
        //o Produto 2: R$ 5.80
        //o Produto 3: R$ 0
        //o Total: R$ 9.00
        //o Dinheiro: R$ 20.00
        //o Troco: R$ 11.00
        //o ...

        Scanner scan = new Scanner(System.in);

        System.out.println("Lojas Tabajara");

        double precoProduto;
        int i = 1;
        double total=0;

        boolean repeat = true;
        while (repeat){

            do {
                System.out.print("Produto "+i+": R$ ");
                precoProduto = scan.nextDouble();
                total += precoProduto;
                i++;
            }while(precoProduto != 0);

            System.out.println("Total: R$ "+total);

            System.out.print("Dinheiro: R$ ");
            int dinheiro = scan.nextInt();

            System.out.println("Troco: R$ "+(dinheiro-total));
            System.out.println("...");
            i=1;
        }
    }
}
