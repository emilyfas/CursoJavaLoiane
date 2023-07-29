package com.loiane.cursojava.aula17.labs;

import java.util.Scanner;

public class exer11 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o primeiro numero: ");
        int i = scan.nextInt();
        System.out.println("Digite o segundo numero: ");
        int x = scan.nextInt();

        int soma = 0;
        for (i+=1; i<x; i++){
            System.out.println(i);
            soma+=i;
        }
        System.out.println("A soma dos numeros é: "+soma);
    }
}
