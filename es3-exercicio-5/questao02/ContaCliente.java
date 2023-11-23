package questao02;

public class ContaCliente {
    private DadosPessoais dadosPessoais;

    public ContaCliente(String nome, String cpf, String endereco) {
        this.dadosPessoais = new DadosPessoais(nome, cpf, endereco);
    }
    // Métodos Getters e Setters
}
