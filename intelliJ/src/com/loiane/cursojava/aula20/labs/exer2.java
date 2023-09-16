package com.loiane.cursojava.aula20.labs;

import java.util.Random;
import java.util.Scanner;

public class exer2 {
    public static void main(String[] args) {
        //Gere e imprima uma matriz M 10x10 com valores aleatórios entre
        //0-9. Após isso indique qual é o maior e o menor valor da linha 5 e
        //qual é o maior e o menor valor da coluna 7
        Scanner scan = new Scanner(System.in);
        Random rand = new Random();

        double[][] M = new double[10][10];
        double maxL5 = Double.MIN_VALUE;
        double minL5 = Double.MAX_VALUE;

        double maxC7 = Double.MIN_VALUE;
        double minC7 = Double.MAX_VALUE;

        for (int i=0; i<M.length; i++){
            for (int j=0; j<M[i].length; j++){
                M[i][j] = rand.nextDouble(10);

                //calc linha 5
                if (i == 5){
                    if (M[i][j]>maxL5) {
                        maxL5 = M[i][j];
                    }
                    if (M[i][j]<minL5){
                        minL5 = M[i][j];
                    }
                    System.out.println("M['5']["+j+"] = "+M[i][j]);
                }

                //calc coluna 7
                if (j == 7){
                    if (M[i][j]>maxC7){
                        maxC7 = M[i][j];
                    }
                    if (M[i][j]<minC7){
                        minC7 = M[i][j];
                    }
                    System.out.println("M["+i+"]['7'] = "+M[i][j]);
                }
            }
        }
        System.out.println("Maior valor da Linha 5: "+maxL5);
        System.out.println("Menor valor da Linha 5: "+minL5);
        System.out.println("Maior valor da Coluna 7: "+maxC7);
        System.out.println("Menor valor da Coluna 7: "+minC7);
    }

}
