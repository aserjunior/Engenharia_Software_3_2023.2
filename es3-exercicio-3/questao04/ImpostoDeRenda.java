package questao04;

import java.util.List;

class ImpostoDeRenda {
    private String cpfContribuinte;
    private List<Double> rendimentos;
    private List<Double> despesas;

    public ImpostoDeRenda(String cpfContribuinte, List<Double> rendimentos, List<Double> despesas) {
        this.cpfContribuinte = cpfContribuinte;
        this.rendimentos = rendimentos;
        this.despesas = despesas;
    }

    public void processar(List<Validacao> validacoes) {
        ValidacaoImpostoDeRenda validar = new ValidacaoImpostoDeRenda(validacoes);
        validar.validarImpostoDeRenda(this);

        CalculadoraImpostoDeRenda calculadora = new CalculadoraImpostoDeRenda();
        double impostoDevido = calculadora.calcularImposto(rendimentos, despesas);

        RelatorioImpostoDeRenda relatorio = new RelatorioImpostoDeRenda();
        relatorio.gerarRelatorio(this, impostoDevido);
    }


    public String getCfpfContribuinte() {
        return cpfContribuinte;
    }

    public List<Double> getRendimentos() {
        return rendimentos;
    }

    public List<Double> getDespesas() {
        return despesas;
    }
}
