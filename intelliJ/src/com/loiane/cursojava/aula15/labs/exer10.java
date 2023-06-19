package com.loiane.cursojava.aula15.labs;

import java.util.Scanner;

public class exer10 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Digite em qual turno voce estuda: ");
        System.out.println("M-matutino, V-Vespertino ou N-Noturno");
        char turno = in.next().trim().toLowerCase().charAt(0);

        switch (turno) {
            case 'm' -> System.out.println("Bom dia!");
            case 'v' -> System.out.println("Boa tarde!");
            case 'n' -> System.out.println("Boa noite!");
        }
    }
}
