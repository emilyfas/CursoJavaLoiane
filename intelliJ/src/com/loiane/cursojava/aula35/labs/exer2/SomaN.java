package com.loiane.cursojava.aula35.labs.exer2;

public class SomaN {
    public static int soma(int n){
        if(n<2) return 1;
        return n + soma(n-1);
    }
}
