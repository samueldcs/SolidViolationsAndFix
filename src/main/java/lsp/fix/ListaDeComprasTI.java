package lsp.fix;

import ocp.fix.LinguagemDeProgramacao;

import java.util.ArrayList;
import java.util.List;

public class ListaDeComprasTI {

    private List<LinguagemDeProgramacao> treinamentosDeProgramacao = new ArrayList<>();

    public void encomendarTreinamentoPara(FuncionarioTI f) {
        treinamentosDeProgramacao.add(f.getLinguagem());
    }
}
