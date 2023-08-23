package com.loiane.cursojava.aula19.labs;

import java.util.Scanner;

public class exer15 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int[] A = new int[10];
        int impares=0;
        int pares=0;
        double perImpares=0;
        double perPares=0;

        for (int i=0; i<A.length; i++){

            System.out.println("Digite o inteiro a ocupar a posição "+i+" da array A:");
            A[i] = scan.nextInt();
        }

        for (int temp : A){

            if ((temp % 2) == 0){
                pares++;
            }else {
                impares++;
            }
        }
        perPares +=  (double) (pares * 100) / A.length;
        perImpares +=  (double) (impares * 100) / A.length;

        System.out.println("A porcentagem dos numeros pares no vetor é: "+perPares+"%");
        System.out.println("A porcentagem dos numeros impares no vetor é: "+perImpares+"%");

    }
}
