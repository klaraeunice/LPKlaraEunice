package FigurasGeometricas;

import java.util.ArrayList;
import java.util.List;

public class RepositorioDeFiguras2D {
    private List<FiguraGeometrica2D> figuras = new ArrayList<>();

    public void adicionar(FiguraGeometrica2D figura) {
        figuras.add(figura);
    }

    public FiguraGeometrica2D remover(int posicao) {
        return figuras.remove(posicao);
    }

    public double recuperarArea(int posicao) {
        return figuras.get(posicao).calculaArea();
    }

    public double recuperarPerimetro(int posicao) {
        return figuras.get(posicao).calculaPerimetro();
    }

    public String recuperarTipo(int posicao) {
        return figuras.get(posicao).getTipo();
    }
}
