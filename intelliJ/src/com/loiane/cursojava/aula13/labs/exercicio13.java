package com.loiane.cursojava.aula13.labs;

import java.util.Scanner;

public class exercicio13 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Digite sua altura: ");
        double altura = scan.nextDouble();
        System.out.println("Digite seu sexo (M para mulher e H para homem): ");
        String sexo = scan.next();

        String homem = "H";
        String mulher = "M";

        if (sexo == homem){
            double pesoIdeal = (72.7 * altura) - 58;
            System.out.println("Seu peso ideal é " + pesoIdeal + "kg");
        } else if (sexo == mulher){
            double pesoIdeal = (62.1 * altura) - 44.7;
            System.out.println("Seu peso ideal é " + pesoIdeal + "kg");
        } else{
            System.out.println("Digite um valor valido para sexo (M para mulher e H para homem)");
        }

    }
}
