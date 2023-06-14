package com.loiane.cursojava.aula15.labs;

import java.util.Scanner;

public class exer4 {

    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        System.out.println("Informe uma letra:");
        char letra = scan.next().charAt(0);

        if (letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u'){
            System.out.println("A letra " + letra + " é uma vogal");
        } else{
            System.out.println("A letra " + letra + " é uma consoante");
        }
    }
}
