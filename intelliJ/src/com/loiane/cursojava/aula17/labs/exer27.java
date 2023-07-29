package com.loiane.cursojava.aula17.labs;

import java.util.Scanner;

public class exer27 {

    public static void main(String[] args) {

        //O Departamento Estadual de Meteorologia lhe contratou para
        //desenvolver um programa que leia as um conjunto indeterminado de
        //temperaturas, e informe ao final a menor e a maior temperaturas
        //informadas, bem como a média das temperaturas.

        Scanner scan = new Scanner(System.in);

        boolean repeat = false;

        double temp = 0;
        int qtdTemp=0;
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        do {
                System.out.println("Informe a "+ (qtdTemp+1) +" temperatura: ");
                int tp = scan.nextInt();
                temp += tp;

                if (tp>max){
                    max=tp;
                }

                if (tp<min){
                    min=tp;
                }

            boolean flag = true;
            do {
                System.out.println("Deseja informar mais uma temperatura?(Digite Sim ou Nao)");
                String doRepeat = scan.next();
                if (doRepeat.equalsIgnoreCase("sim")){
                    repeat = true;
                    flag = true;
                } else if (doRepeat.equalsIgnoreCase("nao")) {
                    repeat = false;
                    flag = true;
                } else{
                    System.out.println("Valor invalido");
                   flag = false;
                }
            }while(!flag);

            qtdTemp++;
        }while(repeat);

        System.out.println("A maior temperatura foi: "+max);
        System.out.println("A menor temperatura foi: "+min);
        System.out.println("A media de teperatura foi de: " + (temp/qtdTemp));

    }
}