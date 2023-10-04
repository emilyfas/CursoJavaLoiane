package com.loiane.cursojava.aula33.labs.exer3;

import java.util.Scanner;

public class Aluno {
    private String nome;
    private int matricula;
    private String curso;
    private String[] disciplinas = new String[3];
    private double[][] notas = new double[3][4];

    public Aluno(){ }

    public Aluno(String nome, int matricula, String curso, String[] disciplinas, double[][] notas) {
        this.nome = nome;
        this.matricula = matricula;
        this.curso = curso;
        this.disciplinas = disciplinas;
        this.notas = notas;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public String[] getDisciplinas() {
        return disciplinas;
    }

    public void setDisciplinas(String[] disciplinas) {
        this.disciplinas = disciplinas;
    }

    public double[][] getNotas() {
        return notas;
    }

    public void setNotas(double[][] notas) {
        this.notas = notas;
    }

    public void menu(){
        Scanner scan = new Scanner(System.in);
        while (true){
            System.out.println("Menu");
            System.out.println("Escolha uma ação: ");
            System.out.println("1.Visualizar Informações\n2.Checar Aprovação \n0.Sair do programa");
            int res = scan.nextInt();

            if (res == 1){
                imprimirInfos();
            } else if (res == 2){
                checarAprovacao();
            }else if (res == 0){
                break;
            }else{
                System.out.println("Opção Invalida!");
            }
        }
    }

    private int pegarDisciplinas(Scanner scan) {
        int indexDisciplina;
        while (true) {
            indexDisciplina = -1;
            System.out.println("De qual disciplina deseja visualizar as notas: ");

            for (int i = 0; i < disciplinas.length; i++) {
                System.out.println(disciplinas[i]);
            }

            String disciplina = scan.next();

            // identificando disciplina
            for (int i = 0; i < disciplinas.length; i++) {
                if (disciplina.equalsIgnoreCase(disciplinas[i])) {
                    indexDisciplina = i;
                }
            }

            if (indexDisciplina >= 0) {
                break;
            }

            System.out.println("Disciplina não foi encontrada.");
        }
        return indexDisciplina;
    }

    public void checarAprovacao() {

        Scanner scan = new Scanner(System.in);

        String situacao;
        double total = 0;

        while (true) {

            int indexDisciplina = pegarDisciplinas(scan);

            for (int i=0; i<notas[indexDisciplina].length; i++){
                total += notas[indexDisciplina][i];
            }

            double media = total/4;

            if (media<6){
                situacao = "Reprovado";
            } else{
                situacao = "Aprovado";
            }

            System.out.println("Disciplina "+disciplinas[indexDisciplina]+":\nSituação: "+situacao+"\nMedia: "+media);

            String repetir;
            while(true){
                System.out.println("Deseja checar notas de outra materia? s/n");
                repetir = scan.next();

                if (repetir.equalsIgnoreCase("n") || repetir.equalsIgnoreCase("s")){
                    break;
                }
                System.out.println("Por favor, digite s ou n");
            }

            if (repetir.equalsIgnoreCase("n")) {
                break;
            }

            total = 0;
        }

    }

    public void imprimirInfos(){
        System.out.println("Nome do aluno: "+nome);
        System.out.println("Numero da matricula: "+matricula);
        System.out.println("Nome do curso: "+curso);
        System.out.println("Disciplinas cursadas: ");
        for (int i=0; i<disciplinas.length; i++){
            System.out.println("- "+disciplinas[i]);
        }
    }
}
