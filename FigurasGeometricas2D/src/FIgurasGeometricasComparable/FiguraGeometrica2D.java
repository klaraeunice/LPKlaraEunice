package FIgurasGeometricasComparable;

public interface FiguraGeometrica2D extends Comparable<FiguraGeometrica2D>{

    double calculaArea();
    double calculaPerimetro();
    String getTipo();
}
