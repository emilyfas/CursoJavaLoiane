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
        int percentual = 0;
        double IR;
        double INSS = 10 * (salarioBruto / 100);
        double FGTS = 11 * (salarioBruto / 100);


        if(salarioBruto > 900 && salarioBruto <= 1500){
            percentual = 5;
        }else if(salarioBruto > 1500 && salarioBruto <= 2500){
            percentual = 10;
        }else if (salarioBruto > 2500){
            percentual = 20;
        }

        IR = percentual * (salarioBruto / 100);

        double descontos = IR + INSS;
        double salarioLiquido = salarioBruto - descontos;

        System.out.println("Salario Bruto: (" + valorHora + " * " + horasTrabalho + ")\t: R$ " + salarioBruto);
        System.out.println("(-) IR: (" + percentual + "%)\t\t: R$ " + IR);
        System.out.println("(-) INSS: (10%)\t\t: R$ " + INSS);
        System.out.println("FGTS: (11%)\t\t\t: R$ " + FGTS);
        System.out.println("Total de descontos:\t\t: R$ " + descontos);
        System.out.println("Salario Liquido:\t\t: R$ " + salarioLiquido);
    }
}
