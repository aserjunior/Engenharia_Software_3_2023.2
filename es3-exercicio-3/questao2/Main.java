package questao2;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora(50.0, 15.0);
        List<Operacao> operacoes = new ArrayList<>();
        operacoes.add(new Soma());
        operacoes.add(new Subtracao());

        List<Double> resultados = calculadora.calcular(operacoes);
        for (double resultado : resultados) {
            System.out.println("Resultado: " + resultado);
        }
    }
}