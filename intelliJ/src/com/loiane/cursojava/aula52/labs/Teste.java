package com.loiane.cursojava.aula52.labs;

import com.loiane.cursojava.aula52.labs.exceptions.AgendaCheiaException;
import com.loiane.cursojava.aula52.labs.exceptions.ContatoNaoExisteException;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Teste {
    public static void main(String[] args) {

        Agenda agenda = new Agenda();
        Scanner scan = new Scanner(System.in);

        System.out.println("Bem vindo a sua agenda!");

        while(true){
            System.out.println("------ Menu ------");
            System.out.println("1 - Consultar Contato");
            System.out.println("2 - Adicionar Contato");
            System.out.println("0 - Encerrar Programa\n");


            try{
                int input = scan.nextInt();

                if(input == 0){
                    break;
                }else if(input == 1){
                    // consultar
                    scriptConsultar(scan,agenda);
                    System.out.println();
                } else if (input == 2) {
                    // adicionar
                    scriptAdicionar(scan,agenda);
                    System.out.println();
                }else{
                    System.out.println("Valor invalido!");
                }


            }catch (InputMismatchException e){
                scan.nextLine();
                System.out.println("Input Invalido!");
            }


        }
        scan.close();
    }
    static void scriptConsultar(Scanner scan, Agenda agenda) {

        System.out.print("Digite o ID do Contato: ");

        try{
            int id = scan.nextInt();
            System.out.println(agenda.consultarContato(id));
        }
        catch (ContatoNaoExisteException e){
            System.out.println('\n' + e.getMessage());
        }
    }

    static void scriptAdicionar(Scanner scan, Agenda agenda){

        try{

            System.out.print("Digite o nome: ");
            scan.nextLine();
            String name = scan.nextLine();

            System.out.print("Digite o telefone: ");
            String num = scan.next();

            agenda.addContato(name,num);
        }
        catch (AgendaCheiaException e){
            System.out.println('\n' + e.getMessage());
        }
    }
}
