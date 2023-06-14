package com.loiane.cursojava.aula13.labs;

import java.util.Scanner;

public class exercicio11 {

    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);
        System.out.println("Digite o primeiro numero inteiro: ");
        int numInt1 = scan.nextInt();
        System.out.println("Digite o segundo numero inteiro: ");
        int numInt2 = scan.nextInt();
        System.out.println("Digite um numero real: ");
        double numDouble = scan.nextDouble();

        int calc1 =  (numInt1 * 2) + (numInt2 / 2);
        //numInt2 não retorna a divisao em double
        System.out.println("O produto do dobro do primeiro numero com metade do segundo: " + calc1);

        double calc2 = (numInt1 * 3) + numDouble;
        System.out.println("A soma do triplo do primeiro com o terceiro: " + calc2);

        double calc3 = numDouble * numDouble * numDouble;
        //double calc3 = Math.pow(numDouble, 3);
        System.out.println("O terceiro elevado ao cubo: " + calc3);
    }
}
