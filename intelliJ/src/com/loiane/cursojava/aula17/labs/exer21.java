package com.loiane.cursojava.aula17.labs;

import java.util.Scanner;

public class exer21 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Quantas turmas deseja avaliar?");
        int qtdTurmas = scan.nextInt();
        int totAlunos=0;

        for (int i=1; i<=qtdTurmas; i++){
            int qtdAlunos;

            do {
                System.out.println("Quantos alunos existem na turma"+i+" (Turmas são limitadas a 40 alunos): ");
                qtdAlunos = scan.nextInt();
            }while (qtdAlunos > 40);

            totAlunos += qtdAlunos;
        }
        int media = totAlunos/qtdTurmas;
        System.out.println("A media de alunos por turma é de: "+media);
    }
}
