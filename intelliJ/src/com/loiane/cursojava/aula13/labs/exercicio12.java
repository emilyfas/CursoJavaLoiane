package com.loiane.cursojava.aula13.labs;

import java.util.Scanner;

public class exercicio12 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Digite sua altura: ");
        double altura = scan.nextDouble();

        double pesoIdeal = (72.7 * altura) - 58;
        System.out.println("Seu peso ideal seria: " + pesoIdeal + "kg");

    }
}
