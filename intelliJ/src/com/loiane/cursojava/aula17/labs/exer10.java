package com.loiane.cursojava.aula17.labs;

import java.util.Scanner;

public class exer10 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        //Faça um programa que receba dois números inteiros e gere os
        //números inteiros que estão no intervalo compreendido por eles.

        System.out.println("Digite o primeiro numero: ");
        int i = scan.nextInt();
        System.out.println("Digite o segundo numero: ");
        int x = scan.nextInt();

        for (i+=1; i<x; i++){
            System.out.println(i);
        }

    }
}
