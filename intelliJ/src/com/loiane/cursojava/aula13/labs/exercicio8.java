package com.loiane.cursojava.aula13.labs;

import java.util.Scanner;
public class exercicio8 {

    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);
        System.out.println("Digite seu salario por hora: ");
        double salarioHora = scan.nextDouble();
        System.out.println("Quantas horas você trabalhou este mês: ");
        double horasTrabalho = scan.nextInt();

        double salarioMensal = salarioHora * horasTrabalho;
        System.out.println("Seu salario mensal foi " + salarioMensal + " reais");
    }
}
