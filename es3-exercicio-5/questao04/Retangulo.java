package questao04;

public class Retangulo {
    private int largura;
    private int altura;

    public Retangulo(int largura, int altura) {
        this.largura = largura;
        this.altura = altura;
    }

    public void setLargura(int largura) {
        this.largura = largura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public int area() {
        return largura * altura;
    }
}

/*
Utilizei o problema de LSP do retângulo e quadrado para exemplificar o problema de
herança. O quadrado é um retângulo, mas não é possível utilizar a classe retângulo
para representar um quadrado, pois o quadrado possui restrições que o retângulo não
possui. 
*/
