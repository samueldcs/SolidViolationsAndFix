package lsp.fix;

import lsp.violation.Funcionario;
import ocp.fix.Java;
import ocp.fix.LinguagemDeProgramacao;

public class DesenvolvedorBack implements FuncionarioTI {
    @Override
    public Double getSalario() {
        return 1080.0;
    }

    @Override
    public LinguagemDeProgramacao getLinguagem() {
        return new Java();
    }
}
