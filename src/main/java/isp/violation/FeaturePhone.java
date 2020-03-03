package isp.violation;

public class FeaturePhone implements Telefone {
    @Override
    public void tocar() {
        String tocar = "BZZ!";
    }

    @Override
    public void carregarBateria() {
        String bateria = "carregando";
    }

    @Override
    public void realizarChamada() {
        String ligando = "Ligando para seu Contato";
    }

    @Override
    public void tirarFoto() {
        String tiraFoto = "XIS!";
    }

    @Override
    public void abrirLojaDeAplicativos() {

    }
}
