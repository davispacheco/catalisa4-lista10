package src.exercicio1.metodos.adicao;

import src.exercicio1.estrutura.vinculosEmpregaticios.Coordenador;
import src.exercicio1.estrutura.vinculosEmpregaticios.Professor;

public class AdicaoProfessorSupervisionado {
    public boolean adicionarProfessorSupervisionado(Coordenador coordenador, Professor professor) {
        if (coordenador.getProfessoresSupervisionados().size() == 10) {
            return false;
        } else {
            coordenador.getProfessoresSupervisionados().add(professor);
            return true;
        }
    }
}
