package lsp.fix;

import java.util.ArrayList;
import java.util.List;

public class ListaDeComprasAgricola {

    private List<String> marcasDeTesouraASeremCompradas = new ArrayList<>();


    public void encomendarTesouraPara(FuncionarioAgricola f) {
        marcasDeTesouraASeremCompradas.add(f.getMarcaFavoritaDeTesoura());
    }
}
