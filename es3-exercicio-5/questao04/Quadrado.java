package questao04;

public class Quadrado {
    private Retangulo retangulo;

    public Quadrado(int lado) {
        this.retangulo = new Retangulo(lado, lado);
    }

    public void setLado(int lado) {
        retangulo.setLargura(lado);
        retangulo.setAltura(lado);
    }

    public int area() {
        return retangulo.area();
    }
}
