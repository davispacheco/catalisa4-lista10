package src.exercicio1.estrutura.vinculosEmpregaticios;

import src.exercicio1.metodos.calculo.CalculadoraReembolsoDespesas;

public class Estagiario extends Empregado implements CalculadoraReembolsoDespesas {
    private double bolsa;

    public Estagiario() {
        this.bolsa = bolsa;
    }
    public void reembolsarDespesas() {
        System.out.println("Despesas do estagiário reembolsadas!");

    }

    public double getBolsa() {
        return bolsa;
    }

    public void setBolsa(double bolsa) {
        this.bolsa = bolsa;
    }
}
