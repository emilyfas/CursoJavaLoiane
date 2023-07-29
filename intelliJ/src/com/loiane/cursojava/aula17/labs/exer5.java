package com.loiane.cursojava.aula17.labs;

import java.util.Scanner;

public class exer5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        boolean finished = false;
        do{
            System.out.println("Digite população do pais A:");
            double paisA = scan.nextDouble();
            System.out.println("Informe porcentagem de crescimento anual do pais A");
            double porcentagemA = scan.nextDouble();

            System.out.println("Digite população do pais B:");
            double paisB = scan.nextDouble();
            System.out.println("Informe porcentagem de crescimento anual do pais B");
            double porcentagemB = scan.nextDouble();

            double porA = (porcentagemA/100);
            double porB = (porcentagemB/100);

            int anos=0;
            while (paisA <= paisB){
                anos++;
                paisA += porA * paisA;
                paisB += porB * paisB;
            }
            System.out.println("Anos necessários: " + anos);


            boolean inputValido = true;
            do {
                System.out.println("Deseja fazer outra operação? (Digite sim ou não)");
                String repeat = scan.next();
                if (repeat.equalsIgnoreCase("sim")) {
                    finished = false;
                    inputValido = true;
                }else if (repeat.equalsIgnoreCase("não")){
                    finished = true;
                    inputValido = true;
                }else{
                    System.out.println("Valor invalido. Digite sim ou não.");
                    inputValido = false;
                }
            }while (!inputValido);
        }while (!finished);
    }
}
