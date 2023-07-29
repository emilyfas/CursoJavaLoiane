package com.loiane.cursojava.aula17.labs;

import java.util.Scanner;

public class exer2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String nome;
        String senha;
        do {
            System.out.println("Digite seu nome de usuário: ");
            nome = scan.next();
            System.out.println("Digite uma senha: ");
            senha = scan.next();
            if (nome.equalsIgnoreCase(senha)){
                System.out.println("Senha invalida! Senha não pode ser igual ao nome de usuario");
            }
        } while (nome.equalsIgnoreCase(senha));
        System.out.println("Usuario registrado com sucesso!");
    }
}
