package com.loiane.cursojava.aula15.labs;

import javax.swing.JOptionPane;
public class exer17 {

    public static void main(String[] args) {

        int ano = Integer.parseInt(JOptionPane.showInputDialog("Informe um ano:"));
        if ((ano%4) == 0){
            JOptionPane.showMessageDialog(null,"O ano " + ano + " é bissexto.");
        }else {
            JOptionPane.showMessageDialog(null,"O ano " + ano + " não é bissexto.");
        }
    }
}
