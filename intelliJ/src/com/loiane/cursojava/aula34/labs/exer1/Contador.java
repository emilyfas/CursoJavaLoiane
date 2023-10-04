package com.loiane.cursojava.aula34.labs.exer1;

public class Contador {
    static int count;

    public Contador() {
        count++;
    }

    public static void zerarContador(){
        count = 0;
    }

    public static void incrementarContador(){
        count++;
    }

    public static void printarContador(){
        System.out.println("Conatdor: "+count);
    }
}
