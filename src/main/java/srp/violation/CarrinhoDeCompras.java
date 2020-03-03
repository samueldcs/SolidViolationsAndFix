package srp.violation;

import srp.common.BankingAPI;
import srp.common.CupomFiscal;
import srp.common.Item;

import java.util.ArrayList;

public class CarrinhoDeCompras {
    private ArrayList<Item> itens;
    private Double custoTotal;

    public void addItem(Item item) {
        itens.add(item);
    }

    public void removerItem(Long id) {
        itens.removeIf(item -> item.getId().equals(id));
    }

    private Double getCustoTotal() {
        itens.forEach(item -> custoTotal += item.getPrice());
        return custoTotal;
    }

    public CupomFiscal processarPagamento(String nomeCliente) {
        new BankingAPI().realizarTransacao(getCustoTotal());
        return new CupomFiscal(nomeCliente, getCustoTotal());
    }

}
