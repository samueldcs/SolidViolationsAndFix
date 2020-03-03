package lsp.violation;

import ocp.fix.LinguagemDeProgramacao;

public class Jardineiro implements Funcionario {
    @Override
    public Double getSalario() {
        return 230.0;
    }

    @Override
    public LinguagemDeProgramacao getLinguagem() {
        throw new UnsupportedOperationException("Plantas não suporam compiladores de nenhuma linguagem!");
    }

    @Override
    public String getMarcaFavoritaDeTesoura() {
        return "Tramontina";
    }
}
