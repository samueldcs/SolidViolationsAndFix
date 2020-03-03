package srp.fix;

import srp.common.CupomFiscal;
import srp.common.Pagamento;

public class GeradorDeCupomFiscal {
    private CupomFiscal gerar(Pagamento pagamento) {
        return new CupomFiscal(pagamento.getNomeCliente(), pagamento.getValor());
    }
}
