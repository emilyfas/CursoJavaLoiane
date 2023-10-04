package com.loiane.cursojava.aula49;

public class Finally {
    public static void main(String[] args) {

        int[] nums = {4,8,16,32,64,128};
        int[] demon = {2,0,4,8,0};

        for (int i = 0; i < nums.length; i++) {
            try {
                System.out.println(nums[i] + "/" + demon[i] + " = " + (nums[i] / demon[i]));
            }
            catch(ArithmeticException erro){
                System.out.println("Ihhh deu erro (ArithmeticException)");
            }
            catch(ArrayIndexOutOfBoundsException erro) {
                System.out.println("Ihh deu erro dnv (ArrayIndexOutOfBoundsException)");
            }
            finally {
                // O finally sempre executado
                System.out.println("Essa linha é impressa sempre apos o try ou o catch\n");
            }
        }
    }
}
