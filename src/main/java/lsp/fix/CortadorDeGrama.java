package lsp.fix;

import lsp.violation.Funcionario;
import ocp.fix.LinguagemDeProgramacao;

public class CortadorDeGrama implements FuncionarioAgricola {
    @Override
    public Double getSalario() {
        return 320.0;
    }

    @Override
    public String getMarcaFavoritaDeTesoura() {
        return "Cerena";
    }
}
