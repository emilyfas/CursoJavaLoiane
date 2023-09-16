package com.loiane.cursojava.aula20.labs;

import java.util.Random;

public class exer1 {
    public static void main(String[] args) {
        // Gere e imprima uma matriz M 4x4 com valores aleatórios entre 0-
        //9. Após isso determine o maior número da matriz e a sua posição
        //(linha, coluna)
        Random rand = new Random();

        double[][] M = new double[4][4];
        double max = Double.MIN_VALUE;
        int maxLine = 0;
        int maxCol = 0;

        for (int i=0; i<M.length; i++){

            System.out.print("M["+i+"] = ");
            for (int j=0; j<M[i].length; j++){
                M[i][j] = rand.nextDouble(10);
                if (M[i][j]>max) {
                    max = M[i][j];
                    maxLine = i;
                    maxCol = j;
                }
                System.out.print(M[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("Maior valor da Matriz: "+max+"\nPosição M["+maxLine+"]"+"["+maxCol+"]");
    }
}
