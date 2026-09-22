public class Retangulo {

    private double largura;
    private double altura;

    public Retangulo() {
        this.largura = 1.0;
        this.altura = 1.0;
    }

    public Retangulo(double altura, double largura) {
        this.largura = largura;
        this.altura = altura;
    }

    public double getLargura() {
        return this.largura;
    }

    public double getAltura() {
        return this.altura;
    }

    public void setLargura(double largura) {
        this.largura = largura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double calcularArea() {
        return this.largura * this.altura;
    }

    public boolean isQuadrado() {
        return this.altura == this.largura;
    }

        
}
