package com.loiane.cursojava.aula15.labs;

import java.util.Scanner;

public class exer3 {

    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        System.out.println("Informe seu sexo (M ou F):");
        char sexo = scan.next().charAt(0);
        char M = 'M';
        char F = 'F';
        char m = 'm';
        char f = 'f';


        if (sexo == M || sexo == m){
            System.out.println("M - Masculino");
        } else if (sexo == F || sexo == f){
            System.out.println("F - Feminino");
        } else {
            System.out.println("Sexo inválido.");
        }
    }
}
