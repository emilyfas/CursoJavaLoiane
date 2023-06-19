package com.loiane.cursojava.aula15.labs;

import java.util.Scanner;

public class exer6 {

    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o primeiro numero:");
        double num1 = scan.nextDouble();
        System.out.println("Digite o segundo numero:");
        double num2 = scan.nextDouble();
        System.out.println("Digite o terceiro numero:");
        double num3 = scan.nextDouble();

        if (num1 > num2 && num1 > num3){
            System.out.println("O numero " + num1 + " é o maior entre os três numeros.");
        } else if (num2 > num3){
            System.out.println("O numero " + num2 + " é o maior entre os três numeros.");
        } else if (num2 < num3){
            System.out.println("O numero " + num3 + " é o maior entre os três numeros.");
        }else{
            System.out.println("Os numeros são iguais.");
        }
    }
}
