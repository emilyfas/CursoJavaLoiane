package com.loiane.cursojava.aula35.labs.exer1;

public class Fibonacci {
    // 0 1 2 3 4 5 6
    // 0 1 1 2 3 5 8
    public static int fibo(int n){
        if(n<2) return n;
        return fibo(n-1) + fibo(n-2);
    }
}
