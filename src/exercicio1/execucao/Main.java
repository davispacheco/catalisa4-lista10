package src.exercicio1.execucao;

import src.exercicio1.estrutura.vinculosEmpregaticios.Estagiario;
import src.exercicio1.estrutura.vinculosEmpregaticios.Coordenador;
import src.exercicio1.estrutura.vinculosEmpregaticios.Professor;
import src.exercicio1.metodos.adicao.AdicaoEstagiario;
import src.exercicio1.metodos.adicao.AdicaoProfessorSupervisionado;
import src.exercicio1.metodos.calculo.CalculadoraSalario;

public class Main {
    public static void main(String[] args) {
        AdicaoEstagiario adicaoEstagiario = new AdicaoEstagiario();
        AdicaoProfessorSupervisionado adicaoProfessorSupervisionado = new AdicaoProfessorSupervisionado();
        CalculadoraSalario calculadoraSalario = new CalculadoraSalario();
        Coordenador coordenador = new Coordenador();
        Estagiario estagiario = new Estagiario();
        Professor p1 = new Professor();
        coordenador.setNome("João");
        coordenador.setCpf("001.432.321-50");
        coordenador.setNumeroDeRegistro("321123");
        coordenador.setOrgaoDeLotacao("Órgão 01");
        coordenador.setSalario(2000);
        adicaoProfessorSupervisionado.adicionarProfessorSupervisionado(coordenador, p1);
        System.out.println("Nome do coordenador: " + coordenador.getNome());
        System.out.println("CPF do coordenador: " + coordenador.getCpf());
        System.out.println("Número de registro: " + coordenador.getNumeroDeRegistro());
        System.out.println("Órgão de lotação: " + coordenador.getOrgaoDeLotacao());
        System.out.println("Salário do coordenador: " + coordenador.getSalario());
        System.out.println("Professores supervisionados: " + coordenador.getProfessoresSupervisionados().size());
        Professor p2 = new Professor();
        adicaoProfessorSupervisionado.adicionarProfessorSupervisionado(coordenador, p2);
        System.out.println("Professores supervisionados: " + coordenador.getProfessoresSupervisionados().size());
        calculadoraSalario.calcularSalario(coordenador, 0.05);
        System.out.println("Novo salário do coordenador: " + coordenador.getSalario());
        coordenador.reembolsarDespesas();
        estagiario.reembolsarDespesas();
        p1.reembolsarDespesas();
    }
}
