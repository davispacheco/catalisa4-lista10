package src.exercicio1.estrutura.vinculosEmpregaticios;

import src.exercicio1.estrutura.ReembolsoDespesas;
import src.exercicio1.estrutura.turmas.Turma;
import java.util.HashSet;
import java.util.Set;

public class Professor extends Funcionario implements ReembolsoDespesas {
    private String nivelDeGraduacao;
    private String disciplinaMinistrada;
    private int quantidadeDeAlunos;
    private int quantidadeDeTurmas;
    private Turma turma;
    private Set<Estagiario> estagiarios = new HashSet<>();

    public Professor() {
        this.nivelDeGraduacao = nivelDeGraduacao;
        this.disciplinaMinistrada = disciplinaMinistrada;
        this.quantidadeDeAlunos = quantidadeDeAlunos;
        this.quantidadeDeTurmas = quantidadeDeTurmas;
        this.turma = turma;
        this.estagiarios = estagiarios;
    }

    @Override
    public void reembolsarDespesas() {
        System.out.println("Despesas do professor reembolsadas!");
    }

    public void adicionaTurma() {
        quantidadeDeTurmas++;
    }

    public boolean adicionarEstagiario(Estagiario estagiario) {
        if (estagiarios.size() >= 2) {
            return false;
        } else {
            estagiarios.add(estagiario);
            return true;
        }
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

    public Turma getTurma() {
        return turma;
    }

    public void setTurma(Turma turma) {
        this.turma = turma;
    }

    public Set<Estagiario> getEstagiarios() {
        return estagiarios;
    }

    public void setEstagiarios(Set<Estagiario> estagiarios) {
        this.estagiarios = estagiarios;
    }
}
