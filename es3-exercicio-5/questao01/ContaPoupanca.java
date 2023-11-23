package questao01;

public class ContaPoupanca extends ContaBancaria {
    public ContaPoupaca(double saldoInicial) {
        super(saldoInicial);
    }

    @Override
    public void sacar(double valor) {
        if (valor > 1000) {
            throw new RuntimeException("Não pode sacar mais de 1000 em uma poupança");
        }
        super.sacar(valor);
    }
}

/*
O motivo dessa herança não ser justifica é pelo motivo de que essa herança está apenas
tentado reutilizar o código da classe ContaBancaria sem nenhum motivo pois, na classe
ContaPoupanca o método herdado está sendo sobrescrito para uma maneira que satisfaça
essa nova classe. Para resolver esse problema, podemos usar composição. Nesse caso,
as exceções ficariam em outra classe e seria passada para a classe ContaPoupanca assim
não seria necessário sobrescrever o método sacar.
*/