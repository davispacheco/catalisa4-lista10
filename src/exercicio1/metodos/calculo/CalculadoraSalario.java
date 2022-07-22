package src.exercicio1.metodos.calculo;

import src.exercicio1.estrutura.vinculosEmpregaticios.Funcionario;

public class CalculadoraSalario {
    public void calcularSalario(Funcionario funcionario, double percentual) {
        double reajuste = funcionario.getSalario() * percentual;
        funcionario.setSalario(funcionario.getSalario() + reajuste);
    }
}
