package com.loiane.cursojava.aula13.labs;

import java.util.Scanner;

public class exercicio9 {

    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);
        System.out.println("Digite uma temperatura em graus Farenheit: ");
        double grausFar = scan.nextDouble();

        double grausCel = 5 * (grausFar - 32) / 9;
        System.out.println("A temperatura em graus Celsius é de: " + grausCel + "C");

    }
}
