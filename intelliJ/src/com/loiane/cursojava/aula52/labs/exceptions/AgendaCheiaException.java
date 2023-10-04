package com.loiane.cursojava.aula52.labs.exceptions;

public class AgendaCheiaException extends Exception{
    @Override
    public String getMessage() {
        return "Não foi possivel adicionar contato! Agenda está cheia!";
    }
}
