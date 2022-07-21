package src.exercicio1.estrutura.vinculosEmpregaticios;

import src.exercicio1.estrutura.Pessoa;

public abstract class Empregado extends Pessoa {
    private String numeroDeRegistro;
    private String orgaoDeLotacao;

    public Empregado() {
        this.numeroDeRegistro = numeroDeRegistro;
        this.orgaoDeLotacao = orgaoDeLotacao;
    }

    public String getNumeroDeRegistro() {
        return numeroDeRegistro;
    }

    public void setNumeroDeRegistro(String numeroDeRegistro) {
        this.numeroDeRegistro = numeroDeRegistro;
    }

    public String getOrgaoDeLotacao() {
        return orgaoDeLotacao;
    }

    public void setOrgaoDeLotacao(String orgaoDeLotacao) {
        this.orgaoDeLotacao = orgaoDeLotacao;
    }
}
