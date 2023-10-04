package com.loiane.cursojava.aula36;

public class Contato {
    private String nome;
    // Tem um
    private Endereco endereco;
    // Tem muitos
    private Telefone[] telefones;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public Telefone[] getTelefones() {
        return telefones;
    }

    public void setTelefones(Telefone[] telefone) {
        this.telefones = telefone;
    }
}
