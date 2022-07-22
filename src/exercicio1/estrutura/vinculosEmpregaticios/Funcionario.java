package src.exercicio1.estrutura.vinculosEmpregaticios;

public abstract class Funcionario extends Empregado {
    private double salario;

    public Funcionario() {
        this.salario = 0;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}
