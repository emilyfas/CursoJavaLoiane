package com.loiane.cursojava.aula13.labs;

import java.util.Scanner;

public class exercicio15 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Qual seu salario por hora?");
        double salarioHora = scan.nextDouble();
        System.out.println("Quantas horas voce trabalhou este mês?");
        int horasTrabalho = scan.nextInt();

        double salarioBruto = salarioHora * horasTrabalho;

        double salarioINSS = (salarioBruto / 100) * 8;
        double salarioSindicato = (salarioBruto / 100) * 5;
        double salarioIR = (salarioBruto / 100) * 11;

        double totalDescontos = salarioIR + salarioINSS + salarioSindicato;
        double salarioLiquido = salarioBruto - totalDescontos;

    }
}
