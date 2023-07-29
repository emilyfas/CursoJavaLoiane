package com.loiane.cursojava.aula17.labs;

import java.util.Scanner;

public class exer26 {

    public static void main(String[] args) {

        //Faça um programa que calcule o fatorial de um número inteiro
        //fornecido pelo usuário. Ex.: 5!=5.4.3.2.1=120. A saída deve ser
        //conforme o exemplo abaixo:

        //o Fatorial de: 5
        //o 5! = 5 . 4 . 3 . 2 . 1 = 120

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite um numero: ");
        int x = scan.nextInt();
        int fat=x;
        int y = x;

        System.out.println("Fatorial de "+x);
        do {
            y--;
            fat = fat*y;
        }while (y!=1);

        System.out.print(x+"! = "+x+" ");

        int i = x-1;
        while (i > 0){

            System.out.print(". "+i+" ");
            i--;
        }
        System.out.println("= "+fat);
    }
}
