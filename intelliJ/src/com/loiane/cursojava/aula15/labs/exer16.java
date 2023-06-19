package com.loiane.cursojava.aula15.labs;

import java.util.Scanner;

public class exer16 {

    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o valor de a:");
        double a = scan.nextDouble();
        if (a==0){
            System.out.println("A equação não é do segundo grau");
        }else{
            System.out.println("Digite o valor de b:");
            double b = scan.nextDouble();
            System.out.println("Digite o valor de c:");
            double c = scan.nextDouble();

            double delta = (b*b) - 4 * a * c;
            double raiz1 = (-b + Math.sqrt(delta))/ 2 * a;
            double raiz2 = (-b - Math.sqrt(delta))/ 2 * a;

            if (delta<0){
                System.out.println("Delta é igual a 0, então a equação não possui raizes reais");
            }else if (delta == 0){
                System.out.println("A equação possui apenas uma raiz: " + raiz1);
            }else{
                System.out.println("A equação possui duas raizes: " + raiz1 + " e " + raiz2);
                System.out.println("Delta: "+delta);
            }
        }





    }
}
