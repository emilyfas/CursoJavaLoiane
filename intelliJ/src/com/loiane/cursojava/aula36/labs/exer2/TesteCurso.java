package com.loiane.cursojava.aula36.labs.exer2;

import java.util.Scanner;

public class TesteCurso {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        Curso curso = new Curso();
        Aluno[] alunos = new Aluno[2];

        for (int i = 0; i < alunos.length; i++) {

            System.out.println("Digite as notas do aluno "+(i+1));
            alunos[i] = new Aluno();

            int[] notas = new int[4];

            for (int j = 0; j < notas.length; j++) {
                System.out.println("Nota "+(j+1)+": ");
                notas[j] = scan.nextInt();
            }
            alunos[i].setNotas(notas);
        }
        curso.setAlunos(alunos);
        curso.mediaAlunos();
        curso.mediaSala();
    }
}
