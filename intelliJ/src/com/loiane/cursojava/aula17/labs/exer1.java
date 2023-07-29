package com.loiane.cursojava.aula17.labs;

import java.util.Scanner;

public class exer1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double nota;
        do {
            System.out.println("Digite a nota do aluno (ente 0 e 10): ");
            nota = scan.nextDouble();
            if (nota < 0 || nota > 10){
                System.out.println("Nota invalida");
            }
        } while (nota < 0 || nota > 10);
        System.out.println("Valor valido");
    }
}
