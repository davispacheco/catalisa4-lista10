package src.exercicio1.metodos.adicao;

import src.exercicio1.estrutura.vinculosEmpregaticios.Estagiario;
import src.exercicio1.estrutura.vinculosEmpregaticios.Professor;

public class AdicaoEstagiario {
    public boolean adicionarEstagiario(Professor professor, Estagiario estagiario) {
        if (professor.getEstagiarios().size() >= 2) {
            return false;
        } else {
            professor.getEstagiarios().add(estagiario);
            return true;
        }
    }
}
