package lsp.fix;

import lsp.violation.Funcionario;
import ocp.fix.LinguagemDeProgramacao;

public class Jardineiro implements FuncionarioAgricola {
    @Override
    public Double getSalario() {
        return 230.0;
    }

    @Override
    public String getMarcaFavoritaDeTesoura() {
        return "Tramontina";
    }
}
