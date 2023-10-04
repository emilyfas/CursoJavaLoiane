package com.loiane.cursojava.aula36.labs.exer2;

public class Curso {
    private String nome;
    private String horario;
    private Professor professor;
    private Aluno[] alunos;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    public Professor getProfessor() {
        return professor;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }

    public Aluno[] getAlunos() {
        return alunos;
    }

    public void setAlunos(Aluno[] alunos) {
        this.alunos = alunos;
    }

    public void mediaAlunos(){

        System.out.println("Media de cada aluno: \n");

        for (int i = 0; i < alunos.length; i++) {

            int media=mediaAluno(i);
            String situacao="REPROVADO";

            if(media >= 7){
                situacao = "APROVADO";
            }
            System.out.println("Media do aluno "+(i+1)+": "+media);
            System.out.println("Situação: "+ situacao + "\n");
        }
    }

    private int mediaAluno(int i){
        int media=0;
        for (int j = 0; j < alunos[i].getNotas().length; j++) {
            media += alunos[i].getUmaNota(j);
        }
        return media/alunos[i].getNotas().length;
    }

    public void mediaSala(){
        int media=0;
        for (int i = 0; i < alunos.length; i++) {
            media += mediaAluno(i);
        }
        System.out.println("A media da sala é: "+media/alunos.length);
    }
}
