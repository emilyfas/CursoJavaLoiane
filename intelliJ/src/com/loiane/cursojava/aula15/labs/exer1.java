package com.loiane.cursojava.aula15.labs;

import java.util.Scanner;

public class exer1 {

    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o primeiro numero: ");
        double num1 = scan.nextDouble();
        System.out.println("Digite o segundo numero: ");
        double num2 = scan.nextDouble();

        if (num1 > num2){
            System.out.println("O primeiro numero é maior.");
        } else if(num2 > num1) {
            System.out.println("O segundo numero é maior.");
        } else{
            System.out.println("Os numeros são iguais.");
        }

    }
}
