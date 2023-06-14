package com.loiane.cursojava.aula14;

import java.util.Scanner;

public class ifElse {

    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        System.out.println("Entre com sua idade: ");
        int idade = scan.nextInt();

        if (idade >= 18){
            System.out.println("È maior de idade!");
        }else {
            System.out.println("È menor de idade.");
        }

        //barato <= 10
        //10 < valor < 15 - pedir desconto
        // 15 <= valot 17 - pesquisar mais
        //>= 17 - muito caro

        System.out.println("Entre com o valor do produto: ");
        double valor = scan.nextDouble();

        if (valor <= 10){
            System.out.println("Esta barato, pode comprar.");
        }else if(valor > 10 && valor < 15){
            System.out.println("Peça desconto.");
        }else if(valor >= 15){
            System.out.println("Pesquise mais, esta muito caro.");
        }else{
            System.out.println("Esta mutio caro.");
        }


    }
}
