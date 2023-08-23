package com.loiane.cursojava.aula19.labs;

import java.util.Scanner;

public class exer14 {


    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int[] A = new int[5];
        int impares=0;
        int somaImpares=0;
        double mediaImpares=0;

        for (int i=0; i<A.length; i++){

            System.out.println("Digite o inteiro a ocupar a posição "+i+" da array A:");
            A[i] = scan.nextInt();
        }

        for (int temp : A){

            if ((temp % 2) != 0){
                impares++;
                somaImpares += temp;
            }
        }
        mediaImpares = (double) somaImpares / impares;

        System.out.println("A media dos numeros impares no vetor é: "+mediaImpares);
    }
}
