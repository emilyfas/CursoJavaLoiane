package com.loiane.cursojava.aula19.labs;

import java.util.Scanner;

public class exer17 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        //.Ler um vetor A com 10 elementos inteiros correspondentes as idades
        //de um grupo de pessoas. Escreva um programa que determine e
        //escreva a quantidade de pessoas que possuem idade superior a 35
        //anos.

        int[] A = new int[10];
        int qtdMaior35=0;

        for (int i=0; i<A.length; i++){
            System.out.println("Digite a idade a ocupar a posição "+i+" no vetor.");
            A[i] = scan.nextInt();

            if (A[i] > 35) {
                qtdMaior35++;
            }
        }
        System.out.println("A quantidade de pessoas com idade maior que 35 é: "+qtdMaior35);

    }
}
