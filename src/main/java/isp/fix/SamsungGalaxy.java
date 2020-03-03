package isp.fix;

public class SamsungGalaxy implements Smartphone {
    @Override
    public void tocar() {
        String tocar = "BZZ!";
    }

    @Override
    public void carregarBateria() {
        String ligando = "BEEP, BEEP (...)";
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
        String loja = "Play Store";
    }
}
