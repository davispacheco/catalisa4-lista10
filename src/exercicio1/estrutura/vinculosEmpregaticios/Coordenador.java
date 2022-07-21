package src.exercicio1.estrutura.vinculosEmpregaticios;

import src.exercicio1.estrutura.ReembolsoDespesas;

public class Coordenador extends Funcionario implements ReembolsoDespesas {
    private int professoresSupervisionados;

    public Coordenador() {
        this.professoresSupervisionados = 0;
    }

    @Override
    public void aumentoSalario() {
        double percentual = 0.05;
        double reajuste = getSalario() * percentual;
        setSalario(getSalario() + reajuste);
    }

    @Override
    public void reembolsarDespesas() {
        System.out.println("Despesas do coordenador reembolsadas!");
    }

    public void adicionaProfessor() {
        if (professoresSupervisionados == 10) {
            System.out.println("Limite de professores supervisionados excedido.");
        } else {
            professoresSupervisionados++;
        }
    }

    public int getProfessoresSupervisionados() {
        return professoresSupervisionados;
    }

    public void setProfessoresSupervisionados(int professoresSupervisionados) {
        this.professoresSupervisionados = professoresSupervisionados;
    }
}
