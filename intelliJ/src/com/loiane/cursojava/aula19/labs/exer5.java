package com.loiane.cursojava.aula19.labs;

import java.util.Scanner;

public class exer5 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int[] A = new int[10];
        int[] B = new int[A.length];

        for (int i=0; i<A.length; i++){

            System.out.println("Digite o inteiro a ocupar a posição "+i+" da array A:");
            A[i] = scan.nextInt();
            B[i] = A[i] * i;
        }
        for (double temp : A){
            System.out.println("A = "+temp);
        }
        for (double temp : B){
            System.out.println("B = "+temp);
        }
    }
}
