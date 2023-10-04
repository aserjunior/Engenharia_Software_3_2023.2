package questao04;

import java.util.List;

public class ValidacaoImpostoDeRenda {
    private List<Validacao> validacoes;

    public ValidacaoImpostoDeRenda(List<Validacao> validacoes) {
        this.validacoes = validacoes;
    }

    public void validarImpostoDeRenda(ImpostoDeRenda impostoDeRenda) {
        for(Validacao validacao : validacoes) {
            validacao.validar(impostoDeRenda);
        }
    }
}
