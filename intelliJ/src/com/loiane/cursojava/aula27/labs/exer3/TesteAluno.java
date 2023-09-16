package com.loiane.cursojava.aula27.labs.exer3;

import java.util.Scanner;

public class TesteAluno {
    public static void main(String[] args) {
        Aluno aluno = new Aluno();

        Scanner scan = new Scanner(System.in);

        System.out.println("Informe nome do aluno: ");
        aluno.nome = scan.next();

        System.out.println("Informe o curso: ");
        aluno.curso = scan.next();

        System.out.println("Informe o numero da matricula:");
        aluno.matricula = scan.nextInt();

        for(int i=0; i<aluno.disciplinas.length; i++){
            System.out.println("Informe a "+(i+1)+" disciplina: ");
            aluno.disciplinas[i] = scan.next();
        }

        for(int i=0; i<aluno.notas.length; i++){
            System.out.println("Insira notas da disciplina "+aluno.disciplinas[i]);
            for (int j=0; j<aluno.notas[i].length; j++){
                System.out.print("Nota " + (j+1) + ": ");
                aluno.notas[i][j] = scan.nextDouble();
            }
            System.out.println();
        }

        // aluno.imprimirInfos();
        // aluno.checarAprovacao();

        aluno.menu();

        System.out.println("\nTchau!");
    }
}
