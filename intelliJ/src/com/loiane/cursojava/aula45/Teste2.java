package com.loiane.cursojava.aula45;

public class Teste2 {
    public static void main(String[] args) {

        // Down Casting só funciona se estiver fazendo referencia ao mesmo tipo de dado

        // down casting
        Object obj1 = obterString();
        // Não retorna erro pois o metodo obterString retorna uma String
        String s1 = (String) obj1;
        System.out.println(s1);

        // up casting
        // pois valor atribuido é do tipo String
        Object obj2 = "Minha String";
        // down casting
        String s2 = (String) obj2;

        System.out.println(s2);

        Object obj3 = new Object();
        // down casting
        // Erro de execução pois o obj3 não faz referencia a uma String
        // String s3 = (String) obj3;
        // System.out.println(s3);

        Object obj4 = obterInteiro();
        // Erro de execução pois objeto não faz referencia a uma String
        //String s4 = (String) obj4;
        //System.out.println(s4);
    }
    public static String obterString(){
        return "minha String";
    }

    public static int obterInteiro(){
        return 12;
    }

}
