package com.loiane.cursojava.aula15.labs;

import java.util.Scanner;

public class exer2 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite um valor:");
        double num = scan.nextDouble();

        if (num < 0){
            System.out.println("O numero " + num + " é negativo.");
        } else if (num > 0){
            System.out.println("O numero " + num + " é positivo.");
        } else {
            System.out.println("O numero é 0.");
        }

    }
}
