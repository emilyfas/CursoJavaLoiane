package com.loiane.cursojava.aula17.labs;

import java.util.Scanner;

public class exer13 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        //Faça um programa que peça dois números, base e expoente, calcule e
        //mostre o primeiro número elevado ao segundo número. Não utilize a
        //função de potência da linguagem.

        System.out.println("Digite o valor da base: ");
        int num1 = scan.nextInt();
        System.out.println("Digite o valor do expoente: ");
        int num2 = scan.nextInt();

        int result=num1;
        for (int i=1; i<num2; i++){
            result *= num1;
        }
        System.out.println("Resultado: "+result);
    }
}
