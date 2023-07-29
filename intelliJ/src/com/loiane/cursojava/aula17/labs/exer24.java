package com.loiane.cursojava.aula17.labs;

import java.util.Scanner;

public class exer24 {

    public static void main(String[] args) {

        //O Sr. Manoel Joaquim acaba de adquirir uma panificadora e pretende
        //implantar a metodologia da tabelinha, que já é um sucesso na sua loja
        //de 1,99. Você foi contratado para desenvolver o programa que monta
        //a tabela de preços de pães, de 1 até 50 pães, a partir do preço do pão
        //informado pelo usuário, conforme o exemplo abaixo:

        //o Preço do pão: R$ 0.18
        //o Panificadora Pão de Ontem - Tabela de preços
        //o 1 - R$ 0.18
        //o 2 - R$ 0.36
        //o ...
        //o 50 - R$ 9.00

        Scanner scan = new Scanner(System.in);

        System.out.println("Informe o preco do pao: ");
        double precoPao = scan.nextDouble();

        System.out.println("o Preço do pão: R$ "+precoPao);
        System.out.println("Panificadora Pão de Ontem - Tabela de preços");

        for (int i=1; i <= 50; i++){
            double preco = i * precoPao;

            System.out.println(i + " - R$ " + preco);
        }
    }
}
