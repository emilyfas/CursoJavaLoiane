package com.loiane.cursojava.aula19.labs;

import java.util.Scanner;

public class exer12 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int[] A = new int[10];
        int somaTotal=0;

        for (int i=0; i<A.length; i++){

            System.out.println("Digite o inteiro a ocupar a posição "+i+" da array A:");
            A[i] = scan.nextInt();
        }

        for (int temp : A) somaTotal += temp;

        System.out.println("A soma de todos os valores do vetor A é: "+somaTotal);
    }
}
