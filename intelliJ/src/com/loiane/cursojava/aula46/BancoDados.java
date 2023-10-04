package com.loiane.cursojava.aula46;

public interface BancoDados extends SqlDCL, SqlDDL, SqlDML{
    // Uma interface pode implementar mais de uma interface

    void abrirConexao();
    void fecharConexao();
}
