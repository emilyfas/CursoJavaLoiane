package com.loiane.cursojava.aula19.labs;

import java.text.DecimalFormat;
import java.util.Scanner;

public class exer4 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int[] A = new int[15];
        double[] B = new double[A.length];

        for (int i=0; i<A.length; i++){

            System.out.println("Digite o inteiro a ocupar a posição "+i+" da array A:");
            A[i] = scan.nextInt();
            B[i] = Math.sqrt(A[i]);
        }

        DecimalFormat df = new DecimalFormat("###,###.###");

        for (double temp : A){
            System.out.println("A = "+temp);
        }
        for (double temp : B){
            System.out.println("B = "+df.format(temp));
        }
    }
}
