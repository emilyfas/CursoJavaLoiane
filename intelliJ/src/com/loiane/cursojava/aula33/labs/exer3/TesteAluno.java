package com.loiane.cursojava.aula33.labs.exer3;

import java.util.Scanner;

public class TesteAluno {
    public static void main(String[] args) {
        Aluno aluno = new Aluno();

        Scanner scan = new Scanner(System.in);

        System.out.println("Informe nome do aluno: ");
        aluno.setNome(scan.next());

        System.out.println("Informe o curso: ");
        aluno.setCurso(scan.next());

        System.out.println("Informe o numero da matricula:");
        aluno.setMatricula(scan.nextInt());

        for(int i=0; i<aluno.getDisciplinas().length; i++){
            System.out.println("Informe a "+(i+1)+" disciplina: ");
            aluno.getDisciplinas()[i] = scan.next();
        }

        for(int i=0; i<aluno.getNotas().length; i++){
            System.out.println("Insira notas da disciplina "+aluno.getDisciplinas()[i]);
            for (int j=0; j<aluno.getNotas()[i].length; j++){
                System.out.print("Nota " + (j+1) + ": ");
                aluno.getNotas()[i][j] = scan.nextDouble();
            }
            System.out.println();
        }

        // aluno.imprimirInfos();
        // aluno.checarAprovacao();

        aluno.menu();

        System.out.println("\nTchau!");
    }
}
