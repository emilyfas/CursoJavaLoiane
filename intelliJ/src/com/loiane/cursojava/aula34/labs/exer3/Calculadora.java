package com.loiane.cursojava.aula34.labs.exer3;

public class Calculadora {

    public static int somar(int x, int y) {
        return x+y;
    }

    public static int subtrair(int x, int y) {
        return x-y;
    }

    public static int multiplicar(int x, int y){
        return x*y;
    }

    public static int dividir(int x, int y){
        return x/y;
    }

    public static double elevarPotencia(double num, double n){
        double res=num;
        for (int i = 1; i < n; i++) {
            res *= num;
        }
        return res;
    }

    public static double fatorial(double x){
        if(x==0){
            return 1;
        }
        double res=x;
        for (int i = 1; i < x; i++) {
            res *= i;
        }
        return res;
    }

}
