package lsp.violation;

import ocp.fix.Java;
import ocp.fix.LinguagemDeProgramacao;
import ocp.fix.PHP;

public class DesenvolvedorBack implements Funcionario {
    @Override
    public Double getSalario() {
        return 1080.0;
    }

    @Override
    public LinguagemDeProgramacao getLinguagem() {
        return new Java();
    }

    @Override
    public String getMarcaFavoritaDeTesoura() {
        throw new UnsupportedOperationException("Código não requer tesouras para ser cortado.");
    }
}
