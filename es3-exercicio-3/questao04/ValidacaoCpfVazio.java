package questao04;

public class ValidacaoCpfVazio implements Validacao {
    public void validar(ImpostoDeRenda impostoDeRenda) {
        if(impostoDeRenda.getCfpfContribuinte().length() == 0) {
            throw new IllegalArgumentException(
                "CPF não pode ser vazio!");
        }
    }
}
