package questao04;

public class ValidacaoCpfCaracteres implements Validacao{
    public void validar(ImpostoDeRenda impostoDeRenda) {
        if(impostoDeRenda.getCfpfContribuinte().length() != 11) {
            throw new IllegalArgumentException(
                "O CPF precisa ter 11 caracteres!");
        }
    }
}
