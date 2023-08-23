package com.loiane.cursojava.aula20;

import java.util.Arrays;
import java.util.Scanner;

public class Matriz {
    public static void main(String[] args) {
        // armazenar as 4 notas do ano de 30 alunos

        Scanner scan = new Scanner(System.in);

        int qtdalunos = 2;
        int qtdNotas=4;

        double[][] notas = new double[qtdalunos][qtdNotas];

        for (int i=0; i<qtdalunos; i++){
            for (int j=0; j<qtdNotas; j++){
                System.out.println("Digite a nota "+j+" do aluno "+i);
                notas[i][j] = scan.nextDouble();
            }
        }

        for (int i=0; i<qtdalunos; i++){
            System.out.print("[");
            for (int j=0; j<qtdNotas; j++){
                if (j == (qtdNotas-1)){
                    System.out.print(notas[i][j]);
                }else {
                    System.out.print(notas[i][j] + ", ");
                }
            }
            System.out.println("]");
        }
    }
}
