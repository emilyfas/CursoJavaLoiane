package com.loiane.cursojava.aula33.labs.exer1;

public class TesteLampada {
    public static void main(String[] args) {
        Lampada lamp = new Lampada();

        lamp.setMarca("philips");
        lamp.setVolts(9);
        lamp.setCor("branca");
        lamp.setPreco(19.0);
        lamp.setTipo("led");
        lamp.setLigada(false);

        lamp.clicarInterruptor();
        lamp.clicarInterruptor();
        lamp.clicarInterruptor();
        lamp.clicarInterruptor();
        lamp.clicarInterruptor();
    }
}
