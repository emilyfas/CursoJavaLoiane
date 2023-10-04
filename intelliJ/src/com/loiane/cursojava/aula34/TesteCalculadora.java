package com.loiane.cursojava.aula34;

public class TesteCalculadora {
    public static void main(String[] args) {
        // Com o modificador static, não é necessario ter uma instancia da classe para usar os seus metodos
        // Ou seja não precisamos de um objeto como o "calc" abaixo
        /*
            MinhaCalculadora calc = new MinhaCalculadora();
            System.out.println(calc.soma(15, 5));
            System.out.println(calc.soma(15, 5, 10));
         */

        System.out.println(MinhaCalculadora.soma(15, 5));
        System.out.println(MinhaCalculadora.soma(15, 5, 10));
        System.out.println(MinhaCalculadora.soma(15.5, 15.5));
        int[] arr = {15, 10, 5, 5, 5};
        System.out.println(MinhaCalculadora.soma(arr));

        // Ainda é possivel acessar os metodos atráves de um objeto
        // Mas não é necessario ter um objeto
        /*
            MinhaCalculadora calc = new MinhaCalculadora();
            System.out.println(calc.soma(arr));
        */

        // Métodos estaticos só recebem metodos e variaveis estaticas
        System.out.println(soma2Valores(12, 14));
    }
    int naoStatic = 12;
    static int soma2Valores(int num1, int num2){
        // Retorna erro pois variavel não é estatica
        //int temp = naoStatic;
        return MinhaCalculadora.soma(num1, num2);
    }
}
