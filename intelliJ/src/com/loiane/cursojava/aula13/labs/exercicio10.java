package com.loiane.cursojava.aula13.labs;

import java.util.Scanner;

public class exercicio10 {

    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);
        System.out.println("Digite uma temperatura em graus Celsius: ");
        double grausCel = scan.nextDouble();

        double grausFar = grausCel * 1.8 + 32;
        System.out.println("A temperatura em graus Fahrenheit é de: " + grausFar + "F");

    }
}
