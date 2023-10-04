package com.loiane.cursojava.aula45;

public class Teste {

    Aluno aluno = new Aluno();

    // up casting
    // transformando uma classe menor em um tipo de uma classe maior (Pessoa é maior que Aluno)
    Pessoa pessoaAluno = aluno;


    // Conversão é feita automaticamente
    // Mas é assim que se faz manualmente
    Pessoa aluno2 = (Pessoa) new Aluno();

    // down casting
    Pessoa aluno3 = new Pessoa();
    // Linha abaixo retorna um erro de execução
    // Por conta de divergencias de dados, ja que pessoa não tem os atributos da classe Aluno
    Aluno aluno4 = (Aluno) aluno3;

}
