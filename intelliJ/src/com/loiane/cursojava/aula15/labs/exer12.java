package com.loiane.cursojava.aula15.labs;

import java.util.Scanner;

public class exer12 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Informe o valor da sua hora de trabalho:");
        double valorHora = in.nextDouble();
        System.out.println("Informe a quantidade de horas trabalhadas no mês:");
        double horasTrabalho = in.nextDouble();


        double salarioBruto = valorHora * horasTrabalho;
        double percentual = 0;
        double IR;
        double INSS = (10.0 / 100.0) * salarioBruto;
        double FGTS = (11.0 / 100.0) * salarioBruto;


        if(salarioBruto <= 900){
            IR = 0;

        }else if(salarioBruto > 900 && salarioBruto <= 1500){
            percentual = 5.0 / 100.0;
            IR = percentual * salarioBruto;

        }else if(salarioBruto > 1500 && salarioBruto <= 2500){
            percentual = 10.0 / 100.0;
            IR = percentual * salarioBruto;

        }else{
            percentual = 20.0 / 100.0;
            IR = percentual * salarioBruto;
        }

        double descontos = IR + INSS;
        double salarioLiquido = salarioBruto - descontos;

        System.out.println("Salario Bruto: (" + valorHora + " * " + horasTrabalho + ")       : R$ " + salarioBruto);
        System.out.println("(-) IR: (" + percentual + "%)                     : R$ " + IR);
        System.out.println("(-) INSS: (10%)                    : R$ " + INSS);
        System.out.println("FGTS: (11%)                        : R$ " + FGTS);
        System.out.println("Total de descontos:                : R$ " + descontos);
        System.out.println("Salario Liquido:                   : R$ " + salarioLiquido);
    }
}
