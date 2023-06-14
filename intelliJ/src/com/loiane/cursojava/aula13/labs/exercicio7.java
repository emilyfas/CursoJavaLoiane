package com.loiane.cursojava.aula13.labs;

import java.util.Scanner;

public class exercicio7 {

    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o tamanho do lado de um quadrado: ");
        double lado = scan.nextDouble();

        double area = Math.pow(lado, 2);


        System.out.println("A area do quadrado informado é " + area + "cm e o dobro desta area é " + (area*2) + "cm");

    }
}
