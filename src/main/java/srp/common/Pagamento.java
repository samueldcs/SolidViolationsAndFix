package srp.common;

public class Pagamento {
    private Double valor;
    private String nomeCliente;
    private Boolean transacaoAceita;

    public Double getValor() {
        return valor;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public Pagamento(Double valor, String nomeCliente, Boolean transacaoAceita) {
        this.valor = valor;
        this.nomeCliente = nomeCliente;
        this.transacaoAceita = transacaoAceita;
    }
}
