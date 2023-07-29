package com.loiane.cursojava.aula17.labs;

import java.util.Scanner;

public class exer22 {

    public static void main(String[] args) {

        //Faça um programa que calcule o valor total investido por um
        //colecionador em sua coleção de CDs e o valor médio gasto em cada
        //um deles. O usuário deverá informar a quantidade de CDs e o valor
        //para em cada um.

        Scanner scan = new Scanner(System.in);

        System.out.println("Quantas CDs voce ira avaliar?");
        int qtdCd = scan.nextInt();
        int precoCd=0;

        for (int i=1; i<=qtdCd; i++){

            System.out.println("Qual preço do CD de numero "+i+": ");
            precoCd += scan.nextInt();
        }
        int media = precoCd/qtdCd;
        System.out.println("O total gasto em CDs foi de: "+precoCd);
        System.out.println("A media de preço pago por CD é de: "+media);
    }
}
