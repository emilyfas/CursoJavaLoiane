package com.loiane.cursojava.aula15.labs;

import java.util.Scanner;

public class exer15 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o primeiro lado do triangulo:");
        double lado1 = scan.nextDouble();
        System.out.println("Digite o segundo lado do triangulo:");
        double lado2 = scan.nextDouble();
        System.out.println("Digite o terceiro lado do triangulo:");
        double lado3 = scan.nextDouble();

        boolean tri = false;

        if ((lado1 + lado2) > lado3){
            tri = true;
        }else if ((lado3 + lado2) > lado1){
            tri = true;
        }else if ((lado3 + lado1) > lado2){
            tri = true;
        }else{
            System.out.println("Os valores não formam um triangulo");
        }

        String tipoTri = "none";

        if (tri){
            if(lado1 == lado2 && lado1 == lado3 && lado2 == lado3){
                tipoTri = "equilátero";
            } else if (lado1 == lado2 || lado1 == lado3 || lado2 == lado3) {
                tipoTri = "isósceles";
            } else {
                tipoTri = "escaleno";
            }
            System.out.println("Os valores formam um triângulo. Se trata de um triângulo " + tipoTri + ".");
        }

    }
}
