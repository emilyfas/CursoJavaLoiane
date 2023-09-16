package com.loiane.cursojava.aula20.labs;

import java.util.Scanner;

public class exer5 {
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

        //Modifique o programa anterior de maneira a guardar os
        //compromissos detodo o ano, organizados por mês, dia e hora
        //(só 8 horas por dia)
        Scanner scan = new Scanner(System.in);

        String[][][] agenda = new String[12][31][8];
        int mes;
        int dia;
        int hora;
        // enquanto não quiser parar o programa
        while (true) {

            System.out.println("Agenda anual - Menu");
            System.out.println("Entre com o valor da operação que deseja relizar:");
            System.out.println("\t1 - Agendar compromisso.");
            System.out.println("\t2 - Visualizar compromisso.");
            System.out.println("\t0 - Encerrar programa.");
            byte res = scan.nextByte();

            if (res == 1) {
                // agendar
                while (true) {
                    System.out.println("Agenda anual - Marcar compromisso");
                    System.out.println("Entre com o mês: ");
                    mes = scan.nextInt();

                    if (mes > 0 && mes <= 12) {
                        break;
                    } else {
                        System.out.println("Erro, valor invalido.");
                    }
                }

                while (true) {
                    System.out.println("Entre com o dia: ");
                    dia = scan.nextInt();

                    if (dia > 0 && dia <= 31) {
                        break;
                    } else {
                        System.out.println("Erro, valor invalido.");
                    }
                }

                while (true) {
                    System.out.println("Entre com a hora: ");
                    hora = scan.nextInt();

                    if (hora > 0 && hora <= 8) {
                        break;
                    } else {
                        System.out.println("Erro, valor invalido.");
                    }
                }

                dia--;
                mes--;
                System.out.println("Digite o compromisso: ");
                agenda[mes][dia][hora] = scan.next();
                System.out.println("Compromisso marcado com sucesso.");

            } else if (res == 2) {
                // visualizar

                while (true) {
                    System.out.println("Agenda anual - Marcar compromisso");
                    System.out.println("Entre com o mês: ");
                    mes = scan.nextInt();

                    if (mes > 0 && mes <= 12) {
                        break;
                    } else {
                        System.out.println("Erro, valor invalido.");
                    }
                }

                while (true) {
                    System.out.println("Entre com o dia: ");
                    dia = scan.nextInt();

                    if (dia > 0 && dia <= 31) {
                        break;
                    } else {
                        System.out.println("Erro, valor invalido.");
                    }
                }

                while (true) {
                    System.out.println("Entre com a hora: ");
                    hora = scan.nextInt();

                    if (hora > 0 && hora <= 8) {
                        break;
                    } else {
                        System.out.println("Erro, valor invalido.");
                    }
                }

                dia--;
                mes--;

                if (agenda[mes][dia][hora] == null) {
                    System.out.println("Não existe compromissos para esta data.");
                } else {
                    System.out.println("Compromisso marcado para " + (mes++) + "/" + (dia++) + " as " + hora + "hrs: ");
                    System.out.println(agenda[mes][dia][hora]);
                }

            } else if (res == 0) {
                System.out.println("Encerrando programa. Até a proxima!");
                break;
            } else {
                System.out.println("Erro, por favor insira um valor valido.");
            }
        }
    }

}
