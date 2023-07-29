package com.loiane.cursojava.aula17.labs;

import java.util.Scanner;

public class exer7 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        //Faça um programa que leia 5 números e informe o maior número

        /*
        System.out.println("Digite o 1 numero: ");
        int num1 = scan.nextInt();
        System.out.println("Digite o 2 numero: ");
        int num2 = scan.nextInt();
        System.out.println("Digite o 3 numero: ");
        int num3 = scan.nextInt();
        System.out.println("Digite o 4 numero: ");
        int num4 = scan.nextInt();
        System.out.println("Digite o 5 numero: ");
        int num5 = scan.nextInt();

        //int max = num1;

        if (max <= num2){
            max = num2;
        }
        if (max <= num3){
            max = num3;
        }
        if (max <= num4){
            max = num4;
        }
        if (max <= num5){
            max = num5;
        }
        */

        int max = Integer.MIN_VALUE;
        for (int i=0;i<5;i++){
            System.out.println("Entre com o "+ (i+1) +" numero: ");
            int temp = scan.nextInt();

            if (temp>max){
                max=temp;
            }
        }
        System.out.println("O maior numero é "+max);
    }
}
