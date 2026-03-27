package FIgurasGeometricasComparable;

public class Quadrado implements FiguraGeometrica2D {
    private double lado;


    public Quadrado(double lado) {
        this.lado = lado;
    }

    @Override
    public double calculaArea() {
        return lado * lado;
    }

    @Override
    public double calculaPerimetro() {
        return 4 * lado;
    }

    @Override
    public String getTipo() {
        return "Comparable.FigurasGeometricas.Quadrado";
    }

    @Override
    public int compareTo(FiguraGeometrica2D o) {
         return Double.compare(this.calculaArea(), o.calculaArea());
    }


}
