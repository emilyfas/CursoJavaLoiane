package com.loiane.cursojava.aula15.labs;

import java.util.Scanner;

public class exer14 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite a primeira nota do aluno:");
        double nota1 = scan.nextDouble();
        System.out.println("Digite a segunda nota do aluno:");
        double nota2 = scan.nextDouble();

        double media = (nota1 + nota2)/2;
        char conceito = 'O';

        String situacao = "nula";

        if (media >= 9 && media <= 10){
            conceito = 'A';
        } else if (media >= 7.5 && media < 9){
            conceito = 'B';
        }else if (media >= 6 && media < 7.5){
            conceito = 'C';
        }else if (media >= 4 && media < 6){
            conceito = 'D';
        }else if (media >= 0 && media < 4){
            conceito = 'E';
        }

        switch (conceito) {
            case 'A', 'B', 'C' -> situacao = "APROVADO";
            case 'D', 'E' -> situacao = "REPROVADO";
        }

        System.out.println("Notas do aluno: " + nota1 + " e " + nota2);
        System.out.println("Media do aluno: " + media);
        System.out.println("Conteito: " + conceito);
        System.out.println("Situação: " + situacao);
    }
}
