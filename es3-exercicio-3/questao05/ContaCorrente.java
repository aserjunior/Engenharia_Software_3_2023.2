package questao05;

import java.util.List;

public class ContaCorrente {
    private String numero;
    private double saldo;
    private List<Transacao> transacoes;
    
    public ContaCorrente(String numero, double saldo) {
        this.numero = numero;
        this.saldo = saldo;
    }

    public void processar(List<Validacoes> validacoes) {
        ContaCorrenteService validar = new ContaCorrenteService(validacoes);
        validar.validarContaCorrente(this);
        
    }

    public String getNumero() {
        return numero;
    }

    public double getSaldo() {
        return saldo;
    }

}
