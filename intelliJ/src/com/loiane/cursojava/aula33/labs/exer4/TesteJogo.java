package com.loiane.cursojava.aula33.labs.exer4;

public class TesteJogo {
    public static void main(String[] args) {
        JogoDaVelha jogo = new JogoDaVelha();

        System.out.println("Bem vindo(a) ao jogo da velha!");
        while (true){
            jogo.imprimirInstruções();
            jogo.realizarJogada();
            jogo.printarTabuleiro();

            boolean ganhou = jogo.checarTabuleiro();

            if (ganhou) break;
        }
    }
}
