package questao03;

public class RelatorioImpostoDeRenda {
    public void gerarRelatorio(ImpostoDeRenda impostoDeRenda, double imposto) {
        System.out.println("CPF: " + impostoDeRenda.getCfpfContribuinte());
        System.out.println("Rendimentos: " + impostoDeRenda.getRendimentos());
        System.out.println("Despesas: " + impostoDeRenda.getDespesas());
        System.out.println("Imposto Devido: " + imposto);
    }
}