package com.loiane.cursojava.aula50;

public class ExceptionGenerica {
    public static void main(String[] args) {
        int[] nums = {4,8,16,32,64,128};
        int[] demon = {2,0,4,8,0};

        for (int i = 0; i < nums.length; i++) {
            try {
                System.out.println(nums[i] + "/" + demon[i] + " = " + (nums[i] / demon[i]));
            }
            catch(Exception e){
//                System.out.println("Aconteceu um erro"); // Não é feito dessa forma
                System.out.println(e.getMessage());
                e.printStackTrace();
            }

        }
        System.out.println("Ainda é executado");
        System.out.println("Erros vão aparecer no fim do programa");
    }
}
