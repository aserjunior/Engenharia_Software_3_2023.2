package questao04;

public class ValidacaoDespesasNegativas implements Validacao {
    public void validar(ImpostoDeRenda impostoDeRenda) {
        for (Double valorDespesas : impostoDeRenda.getDespesas()) {
            if(valorDespesas < 0) {
                throw new IllegalArgumentException(
                    "As despesas não podem ser negativas!");
            }
        }
    }
}
