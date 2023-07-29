package com.loiane.cursojava.aula17.labs;

import java.util.Scanner;

public class exer19 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Quantas notas deseja avaliar?");
        int qtdNotas = scan.nextInt();
        int notas=0;

        for (int i=1; i<=qtdNotas; i++){
            System.out.println("Digite a "+i+" nota: ");
            int temp = scan.nextInt();
            notas += temp;
        }
        int media = notas/qtdNotas;
        System.out.println("A media das notas é: "+media);
    }
}
