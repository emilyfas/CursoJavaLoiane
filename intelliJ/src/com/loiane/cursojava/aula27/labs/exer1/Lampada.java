package com.loiane.cursojava.aula27.labs.exer1;

public class Lampada {
    String marca;
    int volts;
    double preco;
    String cor;
    String tipo;
    boolean ligada;

    void ligarLampada(){
        System.out.println("Lampada ligada");
    }
    void desligarLampada(){
        System.out.println("Lampada desligada");
    }

    void clicarInterruptor(){
        if(ligada){
            ligada = false;
            System.out.println("A lampada está desligada");
        }else{
            ligada = true;
            System.out.println("A lampada está ligada");
        }
    }
}
