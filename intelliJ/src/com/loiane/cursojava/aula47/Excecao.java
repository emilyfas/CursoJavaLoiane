package com.loiane.cursojava.aula47;

import java.util.Arrays;

public class Excecao {
    public static void main(String[] args) {

        int[] arr = new int[4];
        try {
            System.out.println("Antes da exception");

            arr[4] = 12;
            // valores após a excecao não vão executar
            arr[3] = 15;
        } catch (ArrayIndexOutOfBoundsException exception) {
            System.out.println("Uepa! Ai não dá");
        }
        System.out.println(Arrays.toString(arr));
        System.out.println("Este texto não sera impresso");
    }
}
