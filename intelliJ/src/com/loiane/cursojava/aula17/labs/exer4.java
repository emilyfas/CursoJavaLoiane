package com.loiane.cursojava.aula17.labs;

public class exer4 {
    public static void main(String[] args) {

        double paisA = 80000;
        double paisB = 200000;
        double porA = (3.0/100);
        double porB = (1.5/100);

        int anos=0;
        while (paisA < paisB){
            anos++;
            paisA += porA * paisA;
            paisB += porB * paisB;
        }
        System.out.println("Anos necessários: " + anos);
    }
}
