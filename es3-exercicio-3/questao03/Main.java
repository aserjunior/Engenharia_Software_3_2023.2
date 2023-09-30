package questao03;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Double> rendimentos = new ArrayList<>();
        rendimentos.add(2000.00);
        rendimentos.add(1320.00);

        List<Double> despesas = new ArrayList<>();
        despesas.add(400.00);
        despesas.add(400.00);

        ImpostoDeRenda imposto = new ImpostoDeRenda("12345789", rendimentos, despesas);

        imposto.processar();

    }
}
