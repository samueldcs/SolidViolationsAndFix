package ocp.fix;

public class PHP implements LinguagemDeProgramacao {

    @Override
    public String getHelloWorld() {
        return "echo \"Hello world!\";";
    }
}
