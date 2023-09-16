package com.loiane.cursojava.aula24.labs.exer3;

import com.loiane.cursojava.aula24.labs.exer2.Livro;

public class TesteLivroLivraria {
    public static void main(String[] args) {
        LivroDeLivraria livroLivraria = new LivroDeLivraria();

        livroLivraria.nome = "Carrie, a estranha";
        livroLivraria.autor = "Stephen King";
        livroLivraria.editora = "Blabla editor";
        livroLivraria.numPaginas = 320;
        livroLivraria.estado = "novo";
        livroLivraria.estoque = 35;
        livroLivraria.preco = 59.90;
    }
}
