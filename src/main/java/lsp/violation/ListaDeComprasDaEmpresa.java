package lsp.violation;

import ocp.fix.LinguagemDeProgramacao;

import java.util.ArrayList;
import java.util.List;

public class ListaDeComprasDaEmpresa {

    private List<LinguagemDeProgramacao> treinamentosDeProgramacao = new ArrayList<>();
    private List<String> marcasDeTesouraASeremCompradas = new ArrayList<>();

    public void encomendarTreinamentoPara(Funcionario f) {
        treinamentosDeProgramacao.add(f.getLinguagem());
    }

    public void encomendarTesouraPara(Funcionario f) {
        marcasDeTesouraASeremCompradas.add(f.getMarcaFavoritaDeTesoura());
    }
}
