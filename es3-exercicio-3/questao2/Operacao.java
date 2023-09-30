package questao2;

public interface Operacao {
    double executar(double a, double b);
}

class Soma implements Operacao {
    @Override
    public double executar(double a, double b) {
        return a + b;
    }
}

class Subtracao implements Operacao {
    @Override
    public double executar(double a, double b) {
        return a - b;
    }
}
