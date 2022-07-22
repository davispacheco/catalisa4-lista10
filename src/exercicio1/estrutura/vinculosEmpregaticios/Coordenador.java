package src.exercicio1.estrutura.vinculosEmpregaticios;

import src.exercicio1.metodos.calculo.CalculadoraReembolsoDespesas;

import java.util.HashSet;
import java.util.Set;

public class Coordenador extends Funcionario implements CalculadoraReembolsoDespesas {
    private Set<Professor> professoresSupervisionados = new HashSet<>();

    public Coordenador() {
        this.professoresSupervisionados = professoresSupervisionados;
    }

    @Override
    public void reembolsarDespesas() {
        System.out.println("Despesas do coordenador reembolsadas!");
    }

    public Set<Professor> getProfessoresSupervisionados() {
        return professoresSupervisionados;
    }

    public void setProfessoresSupervisionados(Set<Professor> professoresSupervisionados) {
        this.professoresSupervisionados = professoresSupervisionados;
    }
}

