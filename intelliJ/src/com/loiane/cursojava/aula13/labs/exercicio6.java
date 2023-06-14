package com.loiane.cursojava.aula13.labs;

import java.util.Scanner;

public class exercicio6 {

    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o raio de um circulo: ");
        double raio = scan.nextDouble();
        double pi = 3.14;
        double area = pi * (raio * raio);

        // double area = Math.PI * Math.pow(raio. 2);

        System.out.println("A area do quadrado informado é " + area + "cm");

    }
}
