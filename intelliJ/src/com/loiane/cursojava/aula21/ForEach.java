package com.loiane.cursojava.aula21;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class ForEach {

    public static void main(String[] args){

        int[] notas = new int[10];

        Random ran = new Random();
        Scanner scan= new Scanner(System.in);

        /*
        for (int i = 0; i < notas.length; i++) {
            notas[i] = ran.nextInt(10);
        }

        for (int i = 0; i < notas.length; i++) {
            System.out.print(notas[i]+" ");
        }

        System.out.println("\nFor Each");

        for (int nota : notas){
            System.out.print(nota + " ");
        }


        int[] notas2 = new int[3];

        // não funciona - para setar valores precisa ser com o for normal
        for (int nota2 : notas2){
            System.out.println("Digite um valor:");
            nota2 = scan.nextInt();
        }

        for (int nota2 : notas2){
            System.out.print(nota2 + " ");
        }*/


        // Matriz com for each
        int[][] notasAlunos = new int[3][2];

        for (int i = 0; i < notasAlunos.length; i++) {
            for (int j = 0; j < notasAlunos[i].length; j++) {
                notasAlunos[i][j] = ran.nextInt(10);
            }
        }

        System.out.println("\nMatriz output");

        for (int[] notasAluno : notasAlunos){
            for (int nota : notasAluno){
                System.out.print(nota + " ");
            }
            System.out.println();
        }

    }
}
