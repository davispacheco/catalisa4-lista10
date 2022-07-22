package src.exercicio1.estrutura.vinculosEmpregaticios;

import src.exercicio1.metodos.calculo.CalculadoraReembolsoDespesas;
import src.exercicio1.estrutura.turmas.Turma;
import java.util.HashSet;
import java.util.Set;

public class Professor extends Funcionario implements CalculadoraReembolsoDespesas {
    private String nivelDeGraduacao;
    private String disciplinaMinistrada;
    private int quantidadeDeAlunos;
    private int quantidadeDeTurmas;
    private Set<Turma> turmas = new HashSet<>();
    private Set<Estagiario> estagiarios = new HashSet<>();

    public Professor() {
        this.nivelDeGraduacao = nivelDeGraduacao;
        this.disciplinaMinistrada = disciplinaMinistrada;
        this.quantidadeDeAlunos = quantidadeDeAlunos;
        this.turmas = turmas;
        this.estagiarios = estagiarios;
    }

    @Override
    public void reembolsarDespesas() {
        System.out.println("Despesas do professor reembolsadas!");
    }

    public String getNivelDeGraduacao() {
        return nivelDeGraduacao;
    }

    public void setNivelDeGraduacao(String nivelDeGraduacao) {
        this.nivelDeGraduacao = nivelDeGraduacao;
    }

    public String getDisciplinaMinistrada() {
        return disciplinaMinistrada;
    }

    public void setDisciplinaMinistrada(String disciplinaMinistrada) {
        this.disciplinaMinistrada = disciplinaMinistrada;
    }

    public int getQuantidadeDeAlunos() {
        return quantidadeDeAlunos;
    }

    public void setQuantidadeDeAlunos(int quantidadeDeAlunos) {
        this.quantidadeDeAlunos = quantidadeDeAlunos;
    }

    public int getQuantidadeDeTurmas() {
        return quantidadeDeTurmas;
    }

    public void setQuantidadeDeTurmas(int quantidadeDeTurmas) {
        this.quantidadeDeTurmas = quantidadeDeTurmas;
    }

    public Set<Turma> getTurmas() {
        return turmas;
    }

    public void setTurmas(Set<Turma> turmas) {
        this.turmas = turmas;
    }

    public Set<Estagiario> getEstagiarios() {
        return estagiarios;
    }

    public void setEstagiarios(Set<Estagiario> estagiarios) {
        this.estagiarios = estagiarios;
    }
}
