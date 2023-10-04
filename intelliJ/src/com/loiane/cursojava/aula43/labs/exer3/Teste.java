package com.loiane.cursojava.aula43.labs.exer3;

public class Teste {
    public static void main(String[] args) {
        Mamifero camelo = new Mamifero("Camelo", 150, 4, "Amarelo", 2.0, "Mato");
        Mamifero urso = new Mamifero("Urso-do-Canada", 180, 4, "Vermelho", 0.5, "Mel");
        Peixe tubarao = new Peixe("Tubarão", 300, 1.5);

        System.out.println("Zoo:");
        separator();
        camelo.printarInfosAnimal();
        separator();
        urso.printarInfosAnimal();
        separator();
        tubarao.printarInfosAnimal();
        separator();
    }
    private static void separator(){
        System.out.println("---------------------------");
    }
}
