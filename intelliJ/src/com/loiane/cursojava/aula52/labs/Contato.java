package com.loiane.cursojava.aula52.labs;

public class Contato {

    private String name;
    private String telefone;
    private int id;
    private static int counter=0;

    public Contato(String name, String telefone) {
        this.name = name;
        this.telefone = telefone;
        id = counter;
        counter++;
    }

    public Contato() {
        id = counter;
        counter++;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    @Override
    public String toString() {
        return "Name='" + name + '\'' +
                " Telefone='" + telefone + '\'' +
                " Id=" +
                id;
    }
}
