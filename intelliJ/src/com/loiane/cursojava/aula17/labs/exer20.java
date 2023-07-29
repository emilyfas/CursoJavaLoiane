package com.loiane.cursojava.aula17.labs;

import java.util.Scanner;

public class exer20 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Quantas pessoas deseja avaliar?");
        int qtdPessoas = scan.nextInt();
        int idades=0;

        for (int i=1; i<=qtdPessoas; i++){
            System.out.println("Digite a idade da "+i+" pessoas: ");
            int temp = scan.nextInt();
            idades += temp;
        }

        int media = idades/qtdPessoas;

        if (media>0 && media<=25){
            System.out.println("A turma é jovem");
        }else if (media>=26 && media<=60){
            System.out.println("A turma é adulta");
        } else if (media > 60) {
            System.out.println("A turma é idosa");
        }else {
            System.out.println("media foi igual a 0");
        }
    }
}
