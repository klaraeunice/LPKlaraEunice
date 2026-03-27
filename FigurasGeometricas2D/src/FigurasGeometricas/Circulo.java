package FigurasGeometricas;

public class Circulo implements FiguraGeometrica2D {
    private double raio;

    public Circulo(double raio) {
        this.raio = raio;
    }

    @Override
    public double calculaArea() {
        return Math.PI * Math.pow(raio, 2); // pi * r²
    }

    @Override
    public double calculaPerimetro() {
        return 2 * Math.PI * raio; // 2 * pi * r
    }

    @Override
    public String getTipo() {
        return "Círculo";
    }
}
