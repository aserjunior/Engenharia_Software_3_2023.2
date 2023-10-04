package questao04;

public class ValidacaoMaximoRendimentos implements Validacao {
    public void validar(ImpostoDeRenda impostoDeRenda) {
        if(impostoDeRenda.getRendimentos().size() > 5) {
            throw new IllegalArgumentException(
                "Só podem existir 5 rendimentos!");
        }
    } 
}
