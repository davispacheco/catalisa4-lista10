package src.exercicio1.estrutura.vinculosEmpregaticios;

import src.exercicio1.estrutura.ReembolsoDespesas;

public class FuncionarioAdministrativo extends Funcionario implements ReembolsoDespesas {
    private String funcaoAdministrativa;
    private String senioridade;

    public FuncionarioAdministrativo() {
        this.funcaoAdministrativa = funcaoAdministrativa;
        this.senioridade = senioridade;
    }

    @Override
    public void reembolsarDespesas() {
        System.out.println("Despesas do funcionário administrativo reembolsadas!");
    }

    public String getFuncaoAdministrativa() {
        return funcaoAdministrativa;
    }

    public void setFuncaoAdministrativa(String funcaoAdministrativa) {
        this.funcaoAdministrativa = funcaoAdministrativa;
    }

    public String getSenioridade() {
        return senioridade;
    }

    public void setSenioridade(String senioridade) {
        this.senioridade = senioridade;
    }
}
