package com.loiane.cursojava.aula43.labs.exer2;

public abstract class Contribuinte {
    private String nome;
    private double rendaBruta;
    private int aliquota;

    public Contribuinte(String nome, double rendaBruta) {
        this.nome = nome;
        this.rendaBruta = rendaBruta;
    }

    public Contribuinte(String nome, double rendaBruta, int aliquota) {
        this.nome = nome;
        this.rendaBruta = rendaBruta;
        this.aliquota = aliquota;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getRendaBruta() {
        return rendaBruta;
    }

    public void setRendaBruta(double rendaBruta) {
        this.rendaBruta = rendaBruta;
    }

    public int getAliquota() {
        return aliquota;
    }

    public void setAliquota(int aliquota) {
        this.aliquota = aliquota;
    }

    public void calcularImposto() {
        double parcela = (getAliquota() * getRendaBruta())/100;
        System.out.println("Parcela a deduzir: "+parcela);
    }

    @Override
    public String toString() {
        return "Contribuinte{" +
                "nome='" + nome + '\'' +
                ", rendaBruta=" + rendaBruta +
                ", aliquota=" + aliquota +
                '}';
    }
}
