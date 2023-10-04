package questao05;

enum TipoTransacao {
    CREDITO, DEBITO
}

public class Transacao {
    private int id;
    private double valor;
    private TipoTransacao tipo;

    public Transacao(int id, double valor, TipoTransacao tipo) {
        this.id = id;
        this.valor = valor;
        this.tipo = tipo;
    }

    public void processar() {
        TransacaoService validar = new TransacaoService();
        validar.verificarFraude(this);
    }

    public int getId() {
        return id;
    }

    public double getValor() {
        return valor;
    }

    public TipoTransacao getTipo() {
        return tipo;
    }
}
