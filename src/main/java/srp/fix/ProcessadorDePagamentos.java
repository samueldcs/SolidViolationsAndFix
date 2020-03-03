package srp.fix;

import srp.common.BankingAPI;
import srp.common.Pagamento;

public class ProcessadorDePagamentos {
    private Pagamento processar(Double valor, String nomeCliente) {
        new BankingAPI().realizarTransacao(valor);
        return new Pagamento(valor, nomeCliente, Boolean.TRUE);
    }
}
