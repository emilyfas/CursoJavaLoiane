package com.loiane.cursojava.aula33.labs.exer1;

public class Lampada {
    private String marca;
    private int volts;
    private double preco;
    private String cor;
    private String tipo;
    private boolean ligada;

    public Lampada(String marca, int volts, double preco, String cor, String tipo, boolean ligada) {
        this.marca = marca;
        this.volts = volts;
        this.preco = preco;
        this.cor = cor;
        this.tipo = tipo;
        this.ligada = ligada;
    }

    public Lampada() {

    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getVolts() {
        return volts;
    }

    public void setVolts(int volts) {
        this.volts = volts;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    // get do tipo boolean é com is
    public boolean isLigada() {
        return ligada;
    }

    public void setLigada(boolean ligada) {
        this.ligada = ligada;
    }

    private void printarEstado(String estado){
        System.out.println("A lampada está "+estado);
    }

    public void clicarInterruptor(){
        if(ligada){
            ligada = false;
            printarEstado("desligada");
        }else{
            ligada = true;
            printarEstado("ligada");
        }
    }
}
