package com.loiane.cursojava.aula17.labs;

import java.util.Scanner;

public class exer8 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        //Faça um programa que leia 5 números e informe a soma e a média
        //dos números.

        int soma=0;
        for (int i=0; i<5; i++){
            System.out.println("Digite o "+(i+1)+" numero: ");
            int num = scan.nextInt();
            soma += num;
        }
        System.out.println("A soma dos valores é igual a: "+soma);
        System.out.println("A media dos valores é igual a: "+(soma/5));
    }
}
