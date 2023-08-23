package com.loiane.cursojava.aula20;

public class ManipulacaoMatriz {
    public static void main(String[] args) {
        int qtdalunos = 3;
        int qtdNotas=4;

        double[][] notas = new double[qtdalunos][qtdNotas];

        notas[0][0] = 15;
        notas[0][1] = 11.5;
        notas[0][2] = 22;
        notas[0][3] = 12.5;

        notas[1][0] = 15;
        notas[1][1] = 11.5;
        notas[1][2] = 22;
        notas[1][3] = 12.5;

        notas[2][0] = 15;
        notas[2][1] = 11.5;
        notas[2][2] = 22;
        notas[2][3] = 12.5;

        for (int i=0; i<notas.length; i++){
            // System.out.print(notas[i] + " ");
            for (int j=0; j<notas[i].length; j++){
                System.out.print(notas[i][j] + " ");
            }
            System.out.println();
        }

        notas[1][2]=8;
        System.out.println();

        for (int i=0; i<notas.length; i++){
            // System.out.print(notas[i] + " ");
            for (int j=0; j<notas[i].length; j++){
                System.out.print(notas[i][j] + " ");
            }
            System.out.println();
        }

        double soma;
        System.out.println("Calculando media");
        for (int i=0; i<notas.length; i++){
            soma=0;
            for (int j=0; j<notas[i].length; j++){
                soma+= notas[i][j];
            }
            System.out.println("Media aluno "+i+" é: "+(soma/qtdNotas));
        }

    }
}
