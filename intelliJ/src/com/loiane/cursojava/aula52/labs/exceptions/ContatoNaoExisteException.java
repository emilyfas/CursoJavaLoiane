package com.loiane.cursojava.aula52.labs.exceptions;

public class ContatoNaoExisteException extends Exception{

    private int id;

    public ContatoNaoExisteException(int id) {
        this.id = id;
    }

    @Override
    public String getMessage() {
        return "Contato de ID "+id+" não existe!";
    }
}
