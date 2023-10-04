package com.loiane.cursojava.aula41;

// Palavra chave abstract significa que não é possivel ter instancias desta classe.
// Somente as classes filhas (que estendem esta classe) podem ser instanciadas.
public abstract class Pessoa {
    private String nome;
    private String endereco;
    private String telefone;
    private String cpf;
    private String telefoneCelular;

    public Pessoa(String nome, String endereco, String telefone) {
        this.nome = nome;
        this.endereco = endereco;
        this.telefone = telefone;
    }

    public Pessoa() {}

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getTelefoneCelular() {
        return telefoneCelular;
    }

    public void setTelefoneCelular(String telefoneCelular) {
        this.telefoneCelular = telefoneCelular;
    }

    // Metodos tamber podem ser abstratos
    // Um metodo abstrato pode ser usado quando voce quer que os filhos desta classe tenham este metodo
    // Mas o metodo vai depender (vai ser declarado) pelas classes filhas
    public abstract String obterEtiquetaEndereco();

    public abstract void imprimirEtiquetaEndereco();

}
