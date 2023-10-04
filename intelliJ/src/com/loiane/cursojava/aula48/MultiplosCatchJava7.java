package com.loiane.cursojava.aula48;

public class MultiplosCatchJava7 {
     public static void main(String[] args) {
            int[] nums = {4,8,16,32,64,128};
        int[] demon = {2,0,4,8,0};

        for (int i = 0; i < nums.length; i++) {
            try {
                System.out.println(nums[i] + "/" + demon[i] + " = " + (nums[i] / demon[i]));
            }
            catch(ArithmeticException | ArrayIndexOutOfBoundsException erro){
                System.out.println("Ihhh deu erro (ArithmeticException ou ArrayIndexOutOfBoundsException)");
            }
        }
    }
}
