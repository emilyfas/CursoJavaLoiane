package com.loiane.cursojava.aula17.labs;

import java.util.Scanner;

public class exer18 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite um numero inteiro: ");
        int num = scan.nextInt();

        if ((num%num)==0 && (num%1)==0){
            System.out.println("Primo");
        }else{
            System.out.println("Não é parente");
        }
    }
}
