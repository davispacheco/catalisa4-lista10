package src.exercicio1.metodos.adicao;

import src.exercicio1.estrutura.turmas.Turma;
import src.exercicio1.estrutura.vinculosEmpregaticios.Professor;

public class AdicaoTurma {
    public void adicionarTurma(Professor professor, Turma turma) {
        professor.getTurmas().add(turma);
    }
}
