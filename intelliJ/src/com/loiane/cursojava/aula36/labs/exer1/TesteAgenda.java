package com.loiane.cursojava.aula36.labs.exer1;

import java.util.Scanner;

public class TesteAgenda {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        Agenda agenda = new Agenda();

        System.out.println("Bem vindo a sua Agenda");
        System.out.println("Entre com o nome da sua agenda: ");
        agenda.setNome(scan.next());

        Contato[] contatos = new Contato[3];

        System.out.println("Entre com contatos para sua agenda: ");
        for (int i = 0; i < contatos.length; i++) {

            System.out.println("Dados do "+(i+1)+" contato: ");

            contatos[i] = new Contato();

            System.out.println("Nome: ");
            contatos[i].setNome(scan.next());

            System.out.println("Telefone: ");
            contatos[i].setTelefone(scan.next());

            System.out.println("Email: ");
            contatos[i].setEmail(scan.next());
        }

        agenda.setContatos(contatos);

        agenda.menu(scan);
    }
}
