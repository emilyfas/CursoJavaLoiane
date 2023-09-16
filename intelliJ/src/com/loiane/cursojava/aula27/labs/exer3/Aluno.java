package com.loiane.cursojava.aula27.labs.exer3;

import java.util.Scanner;

public class Aluno {
    String nome;
    int matricula;
    String curso;
    String[] disciplinas = new String[3];
    double[][] notas = new double[3][4];

    void menu(){
        Scanner scan = new Scanner(System.in);
        while (true){
            System.out.println("Menu");
            System.out.println("Escolha uma ação: ");
            System.out.println("1.Visualizar Informações\n2.Checar Aprovação \n0.Sair do programa");
            int res = scan.nextInt();

            if (res == 1){
                imprimirInfos();
            } else if (res == 2){
                checarAprovacao();
            }else if (res == 0){
                break;
            }else{
                System.out.println("Opção Invalida!");
            }
        }
    }

    void checarAprovacao() {

        Scanner scan = new Scanner(System.in);

        int indexDisciplina = -1;
        String situacao;
        double total = 0;

        while (true) {

            while(true){
                System.out.println("De qual disciplina deseja visualizar as notas: ");

                for(int i=0; i<disciplinas.length; i++){
                    System.out.println(disciplinas[i]);
                }

                String disciplina = scan.next();

                // identificando disciplina
                for (int i=0; i<disciplinas.length; i++){
                    if (disciplina.equalsIgnoreCase(disciplinas[i])){
                        indexDisciplina = i;
                    }
                }

                if (indexDisciplina >= 0) {
                    break;
                }

                System.out.println("Disciplina não foi encontrada.");
            }

            for (int i=0; i<notas[indexDisciplina].length; i++){
                total += notas[indexDisciplina][i];
            }

            double media = total/4;

            if (media<6){
                situacao = "Reprovado";
            } else{
                situacao = "Aprovado";
            }

            System.out.println("Disciplina "+disciplinas[indexDisciplina]+":\nSituação: "+situacao+"\nMedia: "+media);

            String repetir;
            while(true){
                System.out.println("Deseja checar notas de outra materia? s/n");
                repetir = scan.next();

                if (repetir.equalsIgnoreCase("n") || repetir.equalsIgnoreCase("s")){
                    break;
                }
                System.out.println("Por favor, digite s ou n");
            }

            if (repetir.equalsIgnoreCase("n")) {
                break;
            }

            total = 0;
        }

    }

    void imprimirInfos(){
        System.out.println("Nome do aluno: "+nome);
        System.out.println("Numero da matricula: "+matricula);
        System.out.println("Nome do curso: "+curso);
        System.out.println("Disciplinas cursadas: ");
        for (int i=0; i<disciplinas.length; i++){
            System.out.println("- "+disciplinas[i]);
        }
    }
}
