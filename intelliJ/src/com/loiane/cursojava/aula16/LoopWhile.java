package com.loiane.cursojava.aula16;

import java.util.Scanner;

public class LoopWhile {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite um valor a ser contado: ");
        int max = scan.nextInt();
        double i = 1;
        System.out.println("Contando até " + max);

        while (i <= max){
            System.out.println(i);
            i++;
        }
    }
}
