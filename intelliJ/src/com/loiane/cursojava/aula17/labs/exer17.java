package com.loiane.cursojava.aula17.labs;

import java.util.Scanner;

public class exer17 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite um numero: ");
        int x = scan.nextInt();
        int fat=x;
        int y = x;
        do {
            y--;
            fat = fat*y;
        }while (y!=1);
        System.out.println("O fatorial de "+x+" é igual a: "+fat);
    }
}
