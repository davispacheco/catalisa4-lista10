package src.exercicio1.execucao;

import src.exercicio1.estrutura.vinculosEmpregaticios.Estagiario;
import src.exercicio1.estrutura.vinculosEmpregaticios.Coordenador;
import src.exercicio1.estrutura.vinculosEmpregaticios.Professor;

public class Main {
    public static void main(String[] args) {
        Coordenador coordenador = new Coordenador();
        Estagiario estagiario = new Estagiario();
        Professor professor = new Professor();
        coordenador.setNome("João");
        coordenador.setCpf("001.432.321-50");
        coordenador.setNumeroDeRegistro("321123");
        coordenador.setOrgaoDeLotacao("Órgão 01");
        coordenador.setSalario(2000);
        coordenador.setProfessoresSupervisionados(3);
        System.out.println("Nome do coordenador: " + coordenador.getNome());
        System.out.println("CPF do coordenador: " + coordenador.getCpf());
        System.out.println("Número de registro: " + coordenador.getNumeroDeRegistro());
        System.out.println("Órgão de lotação: " + coordenador.getOrgaoDeLotacao());
        System.out.println("Salário do coordenador: " + coordenador.getSalario());
        System.out.println("Professores supervisionados: " + coordenador.getProfessoresSupervisionados());
        coordenador.adicionaProfessor();
        System.out.println("Professores supervisionados: " + coordenador.getProfessoresSupervisionados());
        coordenador.aumentoSalario();
        System.out.println("Novo salário do coordenador: " + coordenador.getSalario());
        coordenador.reembolsarDespesas();
        estagiario.reembolsarDespesas();
        professor.reembolsarDespesas();
    }
}
