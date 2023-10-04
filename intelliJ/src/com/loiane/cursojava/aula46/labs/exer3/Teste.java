package com.loiane.cursojava.aula46.labs.exer3;

public class Teste {
    public static void main(String[] args) {
        // 2D
        Quadrado quadrado = new Quadrado(2);
        Circulo circulo = new Circulo(2);
        Triangulo triangulo = new Triangulo(3, 2);
        // 3D
        Cilindro cilindro = new Cilindro(2, 3);
        Piramide piramide = new Piramide(2, 3);
        Cubo cubo = new Cubo(3);

        FiguraGeometrica[] figuras = {quadrado, circulo, triangulo, cilindro, piramide, cubo};

        for (FiguraGeometrica fig : figuras) {
            System.out.println(fig);
            System.out.println("Area: " + ((DimensaoSuperficial) fig).calcularArea());
            if (fig instanceof Figura3D){
                System.out.println("Volume: " + ((Figura3D) fig).calcularVolume());
            }
            System.out.println();
        }
    }
}
