package com.loiane.cursojava.aula13.labs;

import java.util.Scanner;

public class exercicio3 {

    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o primeiro número da soma: ");
        int num1 = scan.nextInt();

        System.out.println("Digite o segundo número da soma: ");
        int num2 = scan.nextInt();

        int resultado = num1 + num2;
        System.out.println("O resultado da soma é: " + resultado);

    }
}
