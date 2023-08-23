package com.loiane.cursojava.aula19.labs;

import java.util.Scanner;

public class exer16 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        //Criar um vetor A com 10 elementos inteiros. Escrever um programa
        //que calcule e escreva: a) a soma de elementos armazenados neste
        //vetor que são inferiores a 15; b) a quantidade de elementos
        //armazenados no vetor que são iguais a 15; e c) a média dos
        //elementos armazenados no vetor que são superiores a 15.

        int[] A = new int[10];
        int somaInf15=0;
        int qtd15=0;
        int somaMaior15=0;
        int qtdMaior15=0;
        int mediaMaiorQ15;

        for (int i=0; i<A.length; i++){
            System.out.println("Digite o inteiro a ocupar a posição "+i+" no vetor.");
            A[i] = scan.nextInt();
        }

        for (int i : A){

            if (i<15){
                somaInf15 += i;
            } else if (i==15) {
                qtd15++;
            } else {
                qtdMaior15++;
                somaMaior15 += i;
            }
        }

        mediaMaiorQ15 = somaMaior15/qtdMaior15;

        System.out.println("Resultados:\nSoma menor q 15: "+somaInf15+"\nQtd igual a 15: "+qtd15+"\nMedia maior que 15: "+mediaMaiorQ15);
    }
}
