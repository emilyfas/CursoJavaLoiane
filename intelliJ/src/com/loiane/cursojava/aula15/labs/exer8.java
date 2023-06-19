package com.loiane.cursojava.aula15.labs;

import java.util.Scanner;

public class exer8 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o valor do primeiro produto:");
        double preco1 = scan.nextDouble();
        System.out.println("Digite o valor do segundo produto:");
        double preco2 = scan.nextDouble();
        System.out.println("Digite o valor do terceiro produto:");
        double preco3 = scan.nextDouble();

        if (preco1 < preco2 && preco1 < preco3){
            System.out.println("Voce deve comprar o primeiro produto");
        } else if (preco2 < preco3){
            System.out.println("Voce deve comprar o segundo produto");
        } else if (preco2 > preco3){
            System.out.println("Voce deve comprar o terceiro produto");
        }
    }
}
