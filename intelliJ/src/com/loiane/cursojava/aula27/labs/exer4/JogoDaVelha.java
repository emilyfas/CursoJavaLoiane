package com.loiane.cursojava.aula27.labs.exer4;

import java.util.Scanner;

public class JogoDaVelha {

    char[][] tabuleiro = new char[3][3];

    int jogada;
    char ultimaJog;
    boolean ganhou;
    int qtdX;
    int qtdO;

    public JogoDaVelha(){
         jogada = 0;
         ultimaJog = ' ';
         ganhou = false;
         qtdX = 0;
         qtdO = 0;
    }

    void imprimirInstruções(){

        System.out.println("X - Jogador 1");
        System.out.println("O - Jogador 2\n");
    }

    void printarTabuleiro() {

        for (int i = 0; i < tabuleiro.length; i++) {
            for (int j = 0; j < tabuleiro[i].length; j++) {
                System.out.print(tabuleiro[i][j] + " ");
            }
            System.out.println();
        }
    }

    void realizarJogada() {

        Scanner scan = new Scanner(System.in);

        int col;
        int line;

        while (true) {

            System.out.println("Jogador, informe a linha de sua jogada(1, 2, 3):");
            line = scan.nextInt();

            System.out.println("Jogador, informe a coluna de sua jogada(1, 2, 3):");
            col = scan.nextInt();

            line--;
            col--;

            boolean posicaoDisponivel = checarPosicaoDisponivel(line, col);

            if (posicaoDisponivel) {
                while (true) {

                    String sinal;

                    System.out.println("Digite seu caracter:");
                    sinal = scan.next();
                    if (sinal.toUpperCase().charAt(0) == 'X') {
                        if (ultimaJog == 'X') {
                            System.out.println("É a vez do jogador 2, insira o caracter 'O'");
                        } else {
                            atualizarTabuleiro(line, col, 'X');
                            break;
                        }
                    } else if (sinal.toUpperCase().charAt(0) == 'O') {
                        if (ultimaJog == 'O') {
                            System.out.println("É a vez do jogador 1, insira o caracter 'X'");
                        } else {
                            atualizarTabuleiro(line, col, 'O');
                            break;
                        }
                    } else {
                        System.out.println("valor invalido");
                    }
                }
                break;
            }
        }
    }

    void atualizarTabuleiro(int line, int col, char sinal) {
        tabuleiro[line][col] = sinal;
        ultimaJog = sinal;
        jogada++;
    }

    boolean checarPosicaoDisponivel(int line, int col) {
        if (line < 0 || line > 3 || col < 0 || col > 3) {
            System.out.println("Valor invalido.");
        } else if (tabuleiro[line][col] == 'X' || tabuleiro[line][col] == 'O') {
            System.out.println("Posição ja esta preenchida. Informe outra posição");
        } else {
            return true;
        }
        return false;
    }

    boolean checarTabuleiro() {
        if (jogada > 9) {
            ganhou = true;
            System.out.println("Deu velha!");
            System.out.println("Ninguém ganhou essa partida.");
        } else {
            checarLinhas();
            checarColuna();
            checarDiagonal();
            checarDiagonalInversa();
        }
        return ganhou;
    }

    void checarLinhas() {
        for (int i = 0; i < tabuleiro.length; i++) {
            for (int j = 0; j < tabuleiro[i].length; j++) {
                if (tabuleiro[i][j] == 'X') {
                    qtdX++;
                } else if (tabuleiro[i][j] == 'O') {
                    qtdO++;
                }
            }
            checarGanhou(qtdX, qtdO);
        }

    }

    void checarColuna() {
        for (int i = 0; i < tabuleiro.length; i++) {
            for (int j = 0; j < tabuleiro[i].length; j++) {
                if (tabuleiro[j][i] == 'X') {
                    qtdX++;
                } else if (tabuleiro[j][i] == 'O') {
                    qtdO++;
                }
            }

            checarGanhou(qtdX, qtdO);
        }
    }

    void checarDiagonal() {
        // checando diagonal
        for (int i = 0; i < tabuleiro.length; i++) {
            if (tabuleiro[i][i] == 'X') {
                qtdX++;
            } else if (tabuleiro[i][i] == 'O') {
                qtdO++;
            }
        }

        checarGanhou(qtdX, qtdO);
    }

    void checarDiagonalInversa() {
        int temp = 2;
        for (int i = 0; i < tabuleiro.length; i++) {
            if (tabuleiro[i][temp] == 'X') {
                qtdX++;
            } else if (tabuleiro[i][temp] == 'O') {
                qtdO++;
            }
            temp--;
        }

        checarGanhou(qtdX, qtdO);
    }

    void checarGanhou(int x, int o) {
        if (x > 2) {
            ganhou = true;
            System.out.println("Parabéns, jogador 1 ganhou!");
        }
        if (o > 2) {
            ganhou = true;
            System.out.println("Parabéns, jogador 2 ganhou!");
        }

        qtdX = 0;
        qtdO = 0;
    }
}
