package com.loiane.cursojava.aula35;

public class Recursividade {
    // 5! => 5 * 4 * 3 * 2 * 1 = 120
    // public int fact(int num) // num = 5
    // if(num < 1) return // base condition
    // int ans = 0;
    // return num * fact(num-1) // recursive call
    public static void main(String[] args) {
        System.out.println(fact(5));
    }
    private static int fact(int n){
        // Base condition
        if(n<2) return 1;
        return n * fact(n-1);
    }
}
