package com.loiane.cursojava.aula17.labs;

import java.util.Scanner;

public class exer12 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        //Desenvolva um gerador de tabuada, capaz de gerar a tabuada de
        //qualquer número inteiro entre 1 a 10. O usuário deve informar de qual
        //numero ele deseja ver a tabuada

        int num;
        do {
            System.out.println("Digite um numero de 1 a 10: ");
            num = scan.nextInt();
        } while (num < 1 || num > 10);

        System.out.println("Tabuada de "+num+": ");
        for (int i=1; i<=10; i++){
            System.out.println(num+" x "+i+" = "+ (num*i));
        }
    }
}
