package questao05;

import java.util.List;

enum TipoInvestimento {
    RENDA_FIXA, RENDA_VARIAVEL
}

public class Investimento {
    private int id;
    private double valor;
    private TipoInvestimento tipo;
    private String statusRisco;

    public Investimento(int id, double valor, TipoInvestimento tipo) {
        this.id = id;
        this.valor = valor;
        this.tipo = tipo;
    }

    public void processar() {
        InvestimentoService validar = new InvestimentoService();
        validar.avaliarRisco(this);
    }

    public int getId() {
        return id;
    }

    public double getValor() {
        return valor;
    }
    
    public TipoInvestimento getTipo() {
        return tipo;
    }
}
