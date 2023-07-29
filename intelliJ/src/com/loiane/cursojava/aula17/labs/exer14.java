package com.loiane.cursojava.aula17.labs;

import java.util.Scanner;

public class exer14 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        //Faça um programa que peça 10 números inteiros, calcule e mostre a
        //quantidade de números pares e a quantidade de números impares

        int par=0;
        int impar=0;
        for (int i=0; i<10; i++){
            System.out.println("Digite o "+(i+1)+" numero: ");
            int num = scan.nextInt();

            if ((num%2) != 0){
                impar++;
            }else{
                par++;
            }
        }
        System.out.println("Foram digitados "+par+" numeros pares e "+impar+" numeros impares.");
    }
}
