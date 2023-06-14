package com.loiane.cursojava.aula13.labs;

import java.util.Scanner;

public class exercicio5 {

    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);
        System.out.println("Este programa converte metros em centimetros.");
        System.out.println("Digite um valor em metros: ");
        double valorMetro = scan.nextDouble();

        double valorCm = valorMetro * 100;

        System.out.println("O valor de " + valorMetro + "m em cm é: " + valorCm + "cm");

    }
}
