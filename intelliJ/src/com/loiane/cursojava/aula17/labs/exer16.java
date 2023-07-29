package com.loiane.cursojava.aula17.labs;

import java.util.Scanner;

public class exer16 {

    public static void main(String[] args) {

        int x = 0;
        int y = 1;

        do {
            int temp = x;

            x += y;
            y = temp;
            System.out.print(", " + x);
        } while (x <= 500);
    }
}
