package com.loiane.cursojava.aula19.labs;

import java.util.Scanner;

public class exer11 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int[] A = new int[10];
        int pares=0;

        for (int i=0; i<A.length; i++){

            System.out.println("Digite o inteiro a ocupar a posição "+i+" da array A:");
            A[i] = scan.nextInt();
        }

        for (int temp : A){

            if ((temp % 2) == 0){
                pares++;
            }
        }
        System.out.println("O vetor A tem "+pares+" números pares");
    }
}
