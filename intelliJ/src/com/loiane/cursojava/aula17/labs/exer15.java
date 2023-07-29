package com.loiane.cursojava.aula17.labs;

import java.util.Scanner;

public class exer15 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Digite o numero de vezes a ser gerado: ");
        int times = scan.nextInt();

        long x = 0l;
        long y = 1l;

        for (int i=0; i<times; i++){
            long temp = x;

            x += y;
            y = temp;
            System.out.println(x);
        }
    }
}
