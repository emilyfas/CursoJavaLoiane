package com.loiane.cursojava.aula43.labs.exer2;

public class PessoaFisica extends Contribuinte {

    public PessoaFisica(String nome, double rendaBruta) {
        super(nome, rendaBruta);
    }

    public void calcularAliquota(){
        if(getRendaBruta() >= 0 && getRendaBruta() <= 1400){
            setAliquota(0);
        }else if(getRendaBruta() >= 1400.1 && getRendaBruta() <= 2100){
            setAliquota(10);
        } else if(getRendaBruta() >= 2100.01 && getRendaBruta() <= 2800){
            setAliquota(15);
        } else if(getRendaBruta() >= 2800.01 && getRendaBruta() <= 3600){
            setAliquota(25);
        } else{
            setAliquota(30);
        }
    }
}
