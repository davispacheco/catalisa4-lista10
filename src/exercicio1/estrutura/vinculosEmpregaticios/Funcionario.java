package src.exercicio1.estrutura.vinculosEmpregaticios;

import src.exercicio1.estrutura.ReembolsoDespesas;

public abstract class Funcionario extends Empregado {
    private double salario;

    public Funcionario() {
        this.salario = 0;
    }

    public void aumentoSalario() {
        double percentual = 0.1;
        double reajuste = salario * percentual;
        salario += reajuste;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}
