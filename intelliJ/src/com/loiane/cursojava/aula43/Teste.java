package com.loiane.cursojava.aula43;

public class Teste {
    public static void main(String[] args) {

        Aluno aluno = new Aluno();

        aluno.setCurso("Ciencia da Computacao");
        double[] notas = {5,6,8,3};
        aluno.setNotas(notas);

        System.out.println(aluno.toString());

        String s1 = "alskdhf";
        String s2 = "alskdhF";

        System.out.println(s1.equalsIgnoreCase(s2));

        Aluno aluno2 = new Aluno();

        aluno2.setCurso("Ciencia da Computacao");
        double[] notas2 = {9,6,8,3};
        aluno2.setNotas(notas2);

        System.out.println(aluno.equals(aluno2));
    }
}
