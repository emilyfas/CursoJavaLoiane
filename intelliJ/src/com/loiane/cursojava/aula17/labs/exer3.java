package com.loiane.cursojava.aula17.labs;

import java.util.Scanner;

public class exer3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String nome, sexo, estadoCivil;
        int idade;
        double salario;

        do{
            System.out.println("Digite seu nome: ");
            nome = scan.next();
            if (nome.trim().length() < 3){
                System.out.println("Nome invalido. Nome precisa ser maior que 3 digitos");
            }
        }while (nome.trim().length() < 3);

        do{
            System.out.println("Digite sua idade: ");
            idade = scan.nextInt();
            if (idade <= 0 || idade > 150){
                System.out.println("Idade invalida. Idade precisa estar entre 0 e 150");
            }
        }while (idade <= 0 || idade > 150);

        do{
            System.out.println("Digite seu salario: ");
            salario = scan.nextDouble();
            if (salario < 0){
                System.out.println("Salairo invalido. Salario precisa ser maior que 0");
            }
        }while (salario < 0);

        boolean sexoValido = false;
        do{
            System.out.println("Digite seu sexo (f - feminino ou m - masculino): ");
            sexo = scan.next().toLowerCase();
            if (sexo.equals("f") || sexo.equals("m")){
                sexoValido = true;
            }else{
                System.out.println("Sexo invalido. (f - feminino ou m - masculino)");
                sexoValido = false;
            }
        }while (!sexoValido);

        boolean estadoCivilInvalido = false;
        do{
            System.out.println("Digite seu Estado Civil('s', 'c', 'v', 'd'): ");
            estadoCivil = scan.next();
            if (estadoCivil.equals("s") || estadoCivil.equals("c") || estadoCivil.equals("v") || estadoCivil.equals("d")){
                estadoCivilInvalido = false;
            }else {
                System.out.println("Estado civil invalido. ('s', 'c', 'v', 'd')");
                estadoCivilInvalido = true;
            }
        }while (estadoCivilInvalido);

        System.out.println("Nome " + nome);
        System.out.println("Idade " +idade);
        System.out.println("Salairo " +salario);
        System.out.println("Sexo " +sexo);
        System.out.println("Estado Civil " + estadoCivil);
    }
}
