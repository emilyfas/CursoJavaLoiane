package com.loiane.cursojava.aula20.labs;

import java.util.Scanner;

public class exer4 {
    public static void main(String[] args) {
        // Faça um programa para armazenar em uma matriz os
        //compromissos de uma agenda pessoal. Cada dia do mês deve
        //conter 24 horas, onde para cada uma destas 24 horas podemos
        //associar um tarefa específica (compromisso agendado). O
        //programa deve ter um menu onde o usuário indica o dia do mês
        //que deseja alterar e a hora, entrando em seguida com o
        //compromisso, ou então, o usuário pode também consultar a
        //agenda, fornecendo o dia e a hora para obter o
        //compromisso armazenado
        Scanner scan = new Scanner(System.in);

        String[][] agenda = new String[31][24];
        int dia;
        int hora;
        boolean end = false;

        do {
            System.out.println("Menu - Agenda Mensal");

            while (true){
                System.out.println("Escolha uma das ações abaixo: ");
                System.out.println("\t1.Consultar compromisso.");
                System.out.println("\t2.Agendar compromisso.");
                int atividade = scan.nextInt();

                if (atividade == 1){

                    while (true){
                        System.out.println("Informe o dia que deseja consultar: ");
                        dia = scan.nextInt();
                        if (dia>0 && dia<=31){
                            break;
                        }else {
                            System.out.println("Dia invalido!");
                        }
                    }
                    while (true){
                        System.out.println("Informe a hora do dia "+dia+" que deseja consultar: ");
                        hora = scan.nextInt();
                        if (hora>0 && hora<=24){
                            break;
                        }else {
                            System.out.println("Hora invalida!");
                        }
                    }

                    dia--;

                    if (agenda[dia][hora] == null){
                        System.out.println("Não existem compromissos para este dia.");
                    }else{
                        System.out.println("Aqui o compromisso marcadopara o dia "+dia+" na hora "+hora+": ");
                        System.out.println(agenda[dia][hora]);
                    }
                    break;
                }else if (atividade == 2){
                    while (true){
                        System.out.println("Informe para qual dia deseja agendar: ");
                        dia = scan.nextInt();
                        if (dia>0 && dia<=31){
                            break;
                        }else {
                            System.out.println("Dia invalido!");
                        }
                    }
                    while (true){
                        System.out.println("Informe qual hora do dia "+dia+" deseja agendar: ");
                        hora = scan.nextInt();
                        if (hora>0 && hora<=24){
                            break;
                        }else {
                            System.out.println("Hora invalida!");
                        }
                    }

                    dia--;

                    System.out.println("Digite o compromisso: ");
                    agenda[dia][hora] = scan.next();

                    System.out.println("Compromisso para o dia "+dia+" as "+hora+"h salvo com sucesso!");
                    break;
                }else {
                    System.out.println("Valor informado é invalido!");
                }
            }

            while (true) {
                System.out.println("Deseja voltar para o menu? (s/n)");
                String res = scan.next();

                if (res.toLowerCase().charAt(0) == 's') {
                    System.out.println("Redirecionando para o menu...");
                    break;
                } else if (res.toLowerCase().charAt(0) == 'n') {
                    System.out.println("Tchau, ate a proxima!");
                    end = true;
                    break;
                } else {
                    System.out.println("Valor invalido, programa encerrado!");
                }
            }

        }while (!end);
    }

}
