package com.loiane.cursojava.aula15.labs;

import javax.swing.*;

public class exer19 {

    public static void main(String[] args) {


        String x = JOptionPane.showInputDialog("Digite um numero menor que 1000: ");
        int size = String.valueOf(x).length();

        if (size <= 3 && size != 0){
            String text = "";
            String conect = ", ";

            if (size == 3){
                int cent = Integer.parseInt(String.valueOf(x.charAt(x.length()-3)));
                text =  x + " = " + cent + " centena";
                if (cent == 1){
                    text += "s";
                }
            }
            if (size >= 2){
                int dez = Integer.parseInt(String.valueOf(x.charAt(x.length()-2)));
                if (size ==2){
                    text +=  dez + " dezena";
                }else {
                    text += conect + dez + " dezena";
                }
                if (dez == 1){
                    text += "s";
                }
            }
            int unid = Integer.parseInt(String.valueOf(x.charAt(x.length()-1)));
            if (size == 1){
                text = x + " = " + unid + " unidade";
            }else{
                text += " e " + unid + " unidade";
            }
            if (unid == 1){
                text += "s";
            }

            JOptionPane.showMessageDialog(null, text);
        } else{
            JOptionPane.showMessageDialog(null, "Número infomado é maior que 1000");
        }
    }
}
