package com.loiane.cursojava.aula15.labs;

import javax.swing.JOptionPane;

public class exer18 {

    public static void main(String[] args) {
        String data = JOptionPane.showInputDialog("Informe uma data no formato dd/mm/aaaa: ");
        int size = data.length();

        if (size==10){
            boolean dia;
            boolean mes;
            boolean simb;
            boolean ano;

            int dia1 = Integer.parseInt(String.valueOf(data.charAt(0)));
            int dia2 = Integer.parseInt(String.valueOf(data.charAt(1)));
            if (dia1 == 1 || dia1 == 2){
                dia = true;
            } else if (dia1==3 && dia2<=1) {
                dia = true;
            } else if (dia1==0 && dia2 > 0) {
                dia = true;
            } else {
                dia = false;
            }

            int mes1 = Integer.parseInt(String.valueOf(data.charAt(3)));
            int mes2 = Integer.parseInt(String.valueOf(data.charAt(4)));
            if (mes1==0 && mes2 > 0){
                mes = true;
            } else if (mes1==1 && mes2 <=2) {
                mes = true;
            }else {
                mes = false;
            }

            if(Integer.parseInt(String.valueOf(data.charAt(9))) > 0){
                ano = true;
            }else{
                ano = false;
            }

            if (data.charAt(2)=='/' && data.charAt(5)=='/'){
                simb = true;
            }else{
                simb = false;
            }

            if (dia && mes && ano && simb){
                JOptionPane.showMessageDialog(null, "Data válida");
            }else{
                JOptionPane.showMessageDialog(null, "Data inválida");
            }

        }else{
            JOptionPane.showMessageDialog(null, "Data Inválida");
        }

    }
}
