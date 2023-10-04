package com.loiane.cursojava.aula52.labs;

import com.loiane.cursojava.aula52.labs.exceptions.AgendaCheiaException;
import com.loiane.cursojava.aula52.labs.exceptions.ContatoNaoExisteException;

import java.util.Arrays;

public class Agenda {

    private Contato[] contatos;

    public Agenda() {
        contatos = new Contato[5];
    }

    public Contato[] getContatos() {
        return contatos;
    }

    public String consultarContato(int id) throws ContatoNaoExisteException {

        if(id >= 0 && id < contatos.length && contatos[id] != null){
            return contatos[id].toString();
        }else{
            throw new ContatoNaoExisteException(id);
        }
    }

    public void addContato(String name, String telefone) throws AgendaCheiaException {

        if(contatos[contatos.length - 1] == null){
            for (int i = 0; i < contatos.length; i++) {
                if(contatos[i] == null){
                    contatos[i] = new Contato(name, telefone);
                    return;
                }
            }
        }else{
            throw new AgendaCheiaException();
        }
    }

    @Override
    public String toString() {
        return "Contatos=" + Arrays.toString(contatos);
    }
}
