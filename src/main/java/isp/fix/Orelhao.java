package isp.fix;

public class Orelhao implements Telefone {
    @Override
    public void tocar() {
        String tocar = "BZZ!";
    }

    @Override
    public void realizarChamada() {
        String ligando = "Ligando para seu Contato";
    }

    @Override
    public void tirarFoto() {

    }
}
