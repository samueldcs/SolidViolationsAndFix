package lsp.violation;

import ocp.fix.LinguagemDeProgramacao;

public class CortadorDeGrama implements Funcionario {
    @Override
    public Double getSalario() {
        return 320.0;
    }

    @Override
    public LinguagemDeProgramacao getLinguagem() {
        throw new UnsupportedOperationException("Grama não é algo programável.");
    }

    @Override
    public String getMarcaFavoritaDeTesoura() {
        return "Cerena";
    }
}
