package com.loiane.cursojava.aula16;

import java.util.Scanner;

public class LoopDoWhile {

    public static void main(String[] args){

        Scanner in = new Scanner(System.in);
        int max = in.nextInt();
        int i = 1;

        do{
            i++;
            System.out.println("Valor de i: " + i);
        } while (i == 0);
    }
}
