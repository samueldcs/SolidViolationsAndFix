package ocp.violation;

public class GeradorDeHelloWorld {
    public String gerarHelloWorld(String linguagem) {
        if(linguagem.equals("JAVA")) {
            return "System.out.println(\"Hello world\");";
        } else if(linguagem.equals("PHP")) {
            return "echo \"Hello world!\";";
        }
        return "Não temos essa linguagem!";
    }
}
