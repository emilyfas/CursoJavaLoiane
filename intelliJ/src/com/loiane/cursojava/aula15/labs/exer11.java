package com.loiane.cursojava.aula15.labs;

import java.util.Scanner;

public class exer11 {

    public static void main(String[] args){

        Scanner in = new Scanner(System.in);

        System.out.println("Informe o salario do colaborador:");
        double salario = in.nextDouble();
        double novoSalario = 0;
        int percentual = 0;
        double valorAumento = 0;

        if(salario <= 280){
            percentual = 20;
        }else if(salario > 280 && salario <= 700){
            percentual = 15;
        }else if(salario > 700 && salario <= 1500){
            percentual = 10;
        }else if(salario > 1500){
            percentual = 5;
        }

        valorAumento = percentual * (salario / 100);
        novoSalario = salario + valorAumento;

        System.out.println("O salario antes do reajuste era: " + salario + " reais.");
        System.out.println("O percentual de aumento foi de: " + percentual);
        System.out.println("O valor do aumento foi de: " + valorAumento + " reais.");
        System.out.println("O novo salario do colaborador é de: " + novoSalario + " reais.");
    }
}
