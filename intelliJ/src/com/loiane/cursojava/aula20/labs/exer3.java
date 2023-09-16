package com.loiane.cursojava.aula20.labs;

import java.util.Scanner;

public class exer3 {
    public static void main(String[] args) {
        //Capture do teclado valores para preenchimento de uma matriz M
        //3x3. Após a captura imprima a matriz criada e encontre a
        //quantidade de números pares, a quantidade de números ímpares
        Scanner scan = new Scanner(System.in);

        int[][] M = new int[3][3];
        int pares=0;
        int impares=0;

        for (int i=0; i<M.length; i++){
            for (int j=0; j<M[i].length; j++){
                System.out.println("Digite o numero da posição: M["+i+"]["+j+"]");
                M[i][j] = scan.nextInt();
                if ((M[i][j] % 2) == 0){
                    pares++;
                }else{
                    impares++;
                }
            }
        }

        for (int i=0; i<M.length; i++){
            for (int j=0; j<M[i].length; j++){
                System.out.println(M[i][j]);
            }
            System.out.println();
        }
        System.out.println("Numero de pares: "+pares);
        System.out.println("Numero de impares: "+impares);
    }
}