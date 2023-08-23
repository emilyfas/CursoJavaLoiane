package com.loiane.cursojava.aula19;

public class Array {

    public static void main(String[] args) {

        double tempDia001 = 31.3;
        double tempDia002 = 30;
        double tempDia003 = 27.5;
        double tempDia004 = 29.5;
        double tempDia005 = 25.9;



//        double[] temp = {31.3, 30, 27.5, 29.5, 25.9}; //funciona

        double[] tempDias = new double[365];

        tempDias[0] = 31.3;
        tempDias[1] = 30;
        tempDias[2] = 27.5;
        tempDias[3] = 29.5;
        tempDias[4] = 25.9;

        System.out.println(tempDias[0]);

        System.out.println(tempDias.length);

 /*       for (int i=0; i<tempDias.length; i++){
            System.out.println(tempDias[i]);
        }*/

        for (double temp : tempDias){
            if (temp != 0){
                System.out.println(temp);
            }
        }

    }
}
