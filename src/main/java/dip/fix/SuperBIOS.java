package dip.fix;

import java.util.Arrays;
import java.util.List;

public class SuperBIOS {
    static List<ComputadorComSistemaBootavel> computadores = Arrays.asList(new Macbook(), new DellLatitude(), new HPElite());
    public static void main(String[] args) {
        computadores.forEach(ComputadorComSistemaBootavel::boot);
    }
}
