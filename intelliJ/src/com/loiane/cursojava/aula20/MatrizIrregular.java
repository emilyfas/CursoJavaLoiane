package com.loiane.cursojava.aula20;

import java.util.Scanner;

public class MatrizIrregular {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Entre com o numero de pessoas que serão entrevistadas:");
        int numEntrevistados = scan.nextInt();

        String[][] nomesFilhos = new String[numEntrevistados][];

        for (int i=0; i< nomesFilhos.length; i++) {

            System.out.println("Entre com a quantidade de filhos:");
            int qtdFilhos = scan.nextInt();

            nomesFilhos[i] = new String[qtdFilhos];
            System.out.println();
            for (int j = 0; j < nomesFilhos[i].length; j++) {

                System.out.println("Digite o nome do filho " + (j + 1));
                nomesFilhos[i][j] = scan.next();
            }

        }

        for (int i=0; i< nomesFilhos.length; i++){

            System.out.println("Pessoa "+i+" tem "+nomesFilhos[i].length+" filhos");
            System.out.print("Nomes dos filhos: ");
            for (int j=0; j<nomesFilhos[i].length; j++){

                System.out.print(nomesFilhos[i][j]+" ");
            }
            System.out.println();
        }
    }
}
