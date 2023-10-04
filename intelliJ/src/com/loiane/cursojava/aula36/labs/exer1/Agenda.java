package com.loiane.cursojava.aula36.labs.exer1;

import java.util.Scanner;

public class Agenda {
    private Contato[] contatos;
    private String nome;

    public Contato[] getContatos() {
        return contatos;
    }

    public void setContatos(Contato[] contatos) {
        this.contatos = contatos;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void menu(Scanner scan){
        boolean sair = false;
        while (!sair) {
            int opcao;
            while (true) {
                System.out.println("Selecione uma opção:");
                System.out.println("1. Ver contato especifico.");
                System.out.println("2. Ver todos os contatos.");
                System.out.println("0. Encerrar programa.");
                opcao = scan.nextInt();

                if (opcao >= 0 && opcao <= 2) {
                    break;
                }
                System.out.println("Valor invalido!");
            }

            switch (opcao) {
                case 1:
                    System.out.println("Digite index do contato: ");
                    printaContato(scan.nextInt());
                    break;
                case 2:
                    printaTodosOsContatos();
                    break;
                default: sair=true;
            }
        }
    }

    private void printaContato(int i){
        System.out.println("Nome: "+contatos[i-1].getNome());
        System.out.println("Telefone: "+contatos[i-1].getTelefone());
        System.out.println("Email: "+contatos[i-1].getEmail());
    }

    private void printaTodosOsContatos(){
        for (Contato contato : contatos) {
            System.out.println("Nome: " + contato.getNome());
            System.out.println("Telefone: " + contato.getTelefone());
            System.out.println("Email: " + contato.getEmail()+"\n");
        }
    }
}
