package com.loiane.cursojava.aula27.labs.exer1;

public class TesteLampada {
    public static void main(String[] args) {
        Lampada lamp = new Lampada();

        lamp.marca = "philips";
        lamp.volts = 9;
        lamp.cor = "branca";
        lamp.preco = 19.0;
        lamp.tipo = "led";

        lamp.ligada = false;

        lamp.clicarInterruptor();
        lamp.clicarInterruptor();
        lamp.clicarInterruptor();
        lamp.clicarInterruptor();
        lamp.clicarInterruptor();
    }
}
