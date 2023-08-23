package com.loiane.cursojava.aula19.labs;

import javax.swing.tree.AbstractLayoutCache;
import java.util.Scanner;

public class exer18 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        //Ler um vetor A com 10 elementos inteiros correspondentes as idades
        //de um grupo de pessoas. Escreva um programa que determine e
        //escreva a menor e a maior idades e suas respectivas posições.

        int[] A = new int[10];
        int maiorIdade = Integer.MIN_VALUE;
        int menorIdade = Integer.MAX_VALUE;
        int pscMaior = 0;
        int pscMenor = 0;

        for (int i=0; i<A.length; i++){
            System.out.println("Digite a idade a ocupar a posição "+i+" no vetor.");
            A[i] = scan.nextInt();

            if (A[i] > maiorIdade) {
                maiorIdade=A[i];
                pscMaior = i;
            }
            if (A[i] < menorIdade){
                menorIdade = A[i];
                pscMenor = i;
            }
        }
        System.out.println("Maior idade: "+maiorIdade+"\nPosição: "+pscMaior);
        System.out.println("Menor idade: "+menorIdade+"\nPosição: "+pscMenor);

    }
}
