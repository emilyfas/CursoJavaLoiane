package com.loiane.cursojava.aula15.labs;

import java.util.Scanner;

public class exer13 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite um numero da semana: (1 a 7)");
        int dia = scan.nextInt();

        if (dia >= 1 && dia <=7){
            switch (dia) {
                case 1:
                    System.out.println("Hoje é Domingo");
                    break;
                case 2:
                    System.out.println("Hoje é Segunda");
                    break;
                case 3:
                    System.out.println("Hoje é Terça");
                    break;
                case 4:
                    System.out.println("Hoje é Quarta");
                    break;
                case 5:
                    System.out.println("Hoje é Quinta");
                    break;
                case 6:
                    System.out.println("Hoje é Sexta");
                    break;
                case 7:
                    System.out.println("Hoje é Sabado");
                    break;
            }
        }else{
            System.out.println("Numero invalido (Digite um numero entre 1 e 7)");
        }

    }
}
