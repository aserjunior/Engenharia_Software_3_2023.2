package questao04;

public class ValidacaoRendimentosNegativos implements Validacao {
    public void validar(ImpostoDeRenda impostoDeRenda) {
        for (Double valorRendimento : impostoDeRenda.getRendimentos()) {
            if(valorRendimento < 0) {
                throw new IllegalArgumentException(
                    "Os rendimentos não podem ser negativos!"
                );
            }
        }
    }
}
