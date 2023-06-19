package com.loiane.cursojava.aula15.labs;

import java.util.Scanner;

public class exer9 {

    public static void main(String[] args){

        Scanner in = new Scanner(System.in);

        System.out.println("Digite o primeiro numero:");
        double a = in.nextDouble();
        System.out.println("Digite o segundo numero:");
        double b = in.nextDouble();
        System.out.println("Digite o terceiro numero:");
        double c = in.nextDouble();

        double num1 = a;
        double num2 = 0;
        double num3 = 0;

        if (b < num1 || b == num1){
            num2 = num1;
            num1 = b;
            if (c < num1 || c == num1){
                num3 = num2;
                num2 = num1;
                num1 = c;
            }else if(c < num2){
                num3 = num2;
                num2 = c;
            }else{
                num3 = c;
            }
        }else if (b > num1){
            num2 = b;
            if (c < num1 || c == num1){
                num3 = num2;
                num2 = num1;
                num1 = c;
            }else if(c < num2) {
                num3 = num2;
                num2 = c;
            }else{
                num3 = c;
            }
        }

        System.out.println("Os numeros em ordem decrescente ficam: " + num3 + ", " + num2 + " e " + num1);
    }
}
