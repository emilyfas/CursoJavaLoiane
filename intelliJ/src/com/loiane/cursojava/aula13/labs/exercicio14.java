package com.loiane.cursojava.aula13.labs;

import java.util.Scanner;

public class exercicio14 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Quantos kg de peixe foram pescados?");
        double peso = scan.nextDouble();

        if (peso > 50){
            double excesso = peso - 50;
            double multa = excesso * 4;
            System.out.println("O peso excedeu em excesso " + excesso + "kg, a multa a ser paga é no valor de " + multa + " reais.");
        } else{
            double excesso = 0;
            double multa = 0;
            System.out.println("O peso não excedeu.");
        }
    }
}
