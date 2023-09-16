package com.loiane.cursojava.aula31alt;

import com.loiane.cursojava.aula31.Carro;

public class TesteCarroAlt {
    public static void main(String[] args) {
        Carro carro = new Carro();
        carro.marca = "Fiat";

        // Erro pois var não é public
        // carro.modelo = "modelo";
    }
}
