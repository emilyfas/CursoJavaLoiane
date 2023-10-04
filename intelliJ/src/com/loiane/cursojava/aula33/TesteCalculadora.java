package com.loiane.cursojava.aula33;

public class TesteCalculadora {
    public static void main(String[] args) {
        MinhaCalculadora calc = new MinhaCalculadora();

        System.out.println(calc.soma(15, 5));
        System.out.println(calc.soma(15, 5, 10));
        System.out.println(calc.soma(15.5, 15.5));
        int[] arr = {15, 10, 5, 5, 5};
        System.out.println(calc.soma(arr));
    }
}
