package com.loiane.cursojava.aula44;

public interface AnimalDomesticado {
    // Todos os metodos de uma interface são publicos e abstratos
    // public abstract void levarVeterinario();

    // NOTA: Todos os atributos de uma interface são publicos, estaticos e finais
    // Por isso são usadas interfaces para declarar constantes

    void levarVeterinario();
    void alimentar();
}
