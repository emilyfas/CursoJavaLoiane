package com.loiane.cursojava.aula52;

public class MinhaException {
    public static void main(String[] args) {
        int[] nums = {4,8,5,16,32,21,64,128};
        int[] demon = {2,0,4,8,0,2,4};

        for (int i = 0; i < nums.length; i++) {
            try {
                if(nums[i] % 2 != 0){
                    // exception aqui
                    throw new DivisaoNaoExata(nums[i], demon[i]);
                }
                System.out.println(nums[i] + "/" + demon[i] + " = " + (nums[i] / demon[i]));
            }
            catch(ArithmeticException | ArrayIndexOutOfBoundsException | DivisaoNaoExata e){
                System.out.println("Ihhh deu erro");
                e.printStackTrace();
            }
        }
    }
}
