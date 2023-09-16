package com.loiane.cursojava.aula20.labs;

import java.util.Scanner;

public class exer6 {
    public static void main(String[] args) {
        //Faça um programa para jogar o jogo da velha. O programa deve
        //permitir que dois jogadores façam uma partida do jogo da velha,
        //usando o computador para ver o tabuleiro. Cada jogador vai
        //alternadamente informando a posição onde deseja colocar a sua
        //peça (‘O’ ou ‘X’). O programa deve impedir jogadas inválidas e
        //determinar automaticamente quando o jogo terminou e quem foi o
        //vencedor (jogador1 ou jogador2). A cada nova jogada, o programa
        //deve atualizar a situação do tabuleiro na tela
        Scanner scan = new Scanner(System.in);

        char[][] tabuleiro = new char[3][3];
        int col;
        int line;
        String sinal;
        boolean ganhou = false;
        int jogada = 0;
        char ultimaJog = ' ';

        System.out.println("Bem vindo(a) ao jogo da velha!");
        while (!ganhou) {
            // imprimirInstruções()
            System.out.println("X - Jogador 1");
            System.out.println("O - Jogador 2\n");

            // realizarJogada()
            while (true) {
                System.out.println("Jogador, informe a linha de sua jogada(1, 2, 3):");
                line = scan.nextInt();
                System.out.println("Jogador, informe a coluna de sua jogada(1, 2, 3):");
                col = scan.nextInt();
                line--;
                col--;
                if (line < 0 || line > 3 || col < 0 || col > 3) {
                    System.out.println("Valor invalido.");
                } else if (tabuleiro[line][col] == 'X' || tabuleiro[line][col] == 'O') {
                    System.out.println("Posição ja esta preenchida. Informe outra posição");
                } else {
                    while (true) {

                        System.out.println("Digite seu caracter:");
                        sinal = scan.next();
                        if (sinal.toUpperCase().charAt(0) == 'X') {
                            if (ultimaJog == 'X') {
                                System.out.println("É a vez do jogador 2, insira o caracter 'O'");
                            } else {
                                tabuleiro[line][col] = 'X';
                                ultimaJog = 'X';
                                jogada++;
                                break;
                            }
                        } else if (sinal.toUpperCase().charAt(0) == 'O') {
                            if (ultimaJog == 'O') {
                                System.out.println("É a vez do jogador 1, insira o caracter 'X'");
                            } else {
                                tabuleiro[line][col] = 'O';
                                ultimaJog = 'O';
                                jogada++;
                                break;
                            }
                        } else {
                            System.out.println("valor invalido");
                        }
                    }
                    break;
                }
            }

            // printaTabuleiro()
            for (int i = 0; i < tabuleiro.length; i++) {
                for (int j = 0; j < tabuleiro[i].length; j++) {
                    System.out.print(tabuleiro[i][j] + " ");
                }
                System.out.println();
            }

            // checarVencedor()
            if ((tabuleiro[0][0] == 'X' && tabuleiro[0][1] == 'X' && tabuleiro[0][2] == 'X') ||     //linha 1
                    (tabuleiro[1][0] == 'X' && tabuleiro[1][1] == 'X' && tabuleiro[1][2] == 'X') || //linha 2
                    (tabuleiro[2][0] == 'X' && tabuleiro[2][1] == 'X' && tabuleiro[2][2] == 'X') || //linha 3
                    (tabuleiro[0][0] == 'X' && tabuleiro[1][0] == 'X' && tabuleiro[2][0] == 'X') || //coluna 1
                    (tabuleiro[0][1] == 'X' && tabuleiro[1][1] == 'X' && tabuleiro[2][1] == 'X') || //coluna 2
                    (tabuleiro[0][2] == 'X' && tabuleiro[1][2] == 'X' && tabuleiro[2][2] == 'X') || //coluna 3
                    (tabuleiro[0][0] == 'X' && tabuleiro[1][1] == 'X' && tabuleiro[2][2] == 'X') || //diagonal
                    (tabuleiro[0][2] == 'X' && tabuleiro[1][1] == 'X' && tabuleiro[2][0] == 'X')) {  //diagonal inversa
                ganhou = true;
                System.out.println("Parabéns, jogador 1 ganhou!");
            } else if ((tabuleiro[0][0] == 'O' && tabuleiro[0][1] == 'O' && tabuleiro[0][2] == 'O') ||     //linha 1
                    (tabuleiro[1][0] == 'O' && tabuleiro[1][1] == 'O' && tabuleiro[1][2] == 'O') || //linha 2
                    (tabuleiro[2][0] == 'O' && tabuleiro[2][1] == 'O' && tabuleiro[2][2] == 'O') || //linha 3
                    (tabuleiro[0][0] == 'O' && tabuleiro[1][0] == 'O' && tabuleiro[2][0] == 'O') || //coluna 1
                    (tabuleiro[0][1] == 'O' && tabuleiro[1][1] == 'O' && tabuleiro[2][1] == 'O') || //coluna 2
                    (tabuleiro[0][2] == 'O' && tabuleiro[1][2] == 'O' && tabuleiro[2][2] == 'O') || //coluna 3
                    (tabuleiro[0][0] == 'O' && tabuleiro[1][1] == 'O' && tabuleiro[2][2] == 'O') || //diagonal
                    (tabuleiro[0][2] == 'O' && tabuleiro[1][1] == 'O' && tabuleiro[2][0] == 'O')) {  //diagonal inversa
                ganhou = true;
                System.out.println("Parabéns, jogador 2 ganhou!");
            } else if (jogada > 9) {
                ganhou = true;
                System.out.println("Deu velha!");
                System.out.println("Ninguém ganhou essa partida.");
            }
        }
    }
}
