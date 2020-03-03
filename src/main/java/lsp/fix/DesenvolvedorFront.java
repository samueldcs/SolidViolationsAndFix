package lsp.fix;

import lsp.violation.Funcionario;
import ocp.fix.LinguagemDeProgramacao;
import ocp.fix.PHP;

public class DesenvolvedorFront implements FuncionarioTI {
    @Override
    public Double getSalario() {
        return 1080.0;
    }

    @Override
    public LinguagemDeProgramacao getLinguagem() {
        return new PHP();
    }
}
