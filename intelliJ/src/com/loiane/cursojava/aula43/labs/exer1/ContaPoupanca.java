package com.loiane.cursojava.aula43.labs.exer1;

public class ContaPoupanca extends ContaBancaria{
    private double diaRendimento;

    public double getDiaRendimento() {
        return diaRendimento;
    }

    public void setDiaRendimento(double diaRendimento) {
        this.diaRendimento = diaRendimento;
    }

    public void calcularNovoSaldo(){
        double novoSaldo = getSaldo() + ((diaRendimento * getSaldo())/100);
        setSaldo(novoSaldo);
        printarSaldo();
    }

    @Override
    public String toString() {
        return "ContaPoupanca{" +
                "diaRendimento=" + diaRendimento +
                '}';
    }
}
