package simuladoProva3;

public class Produto {

    private int cod;
    private double preco;

    public Produto(int cod, double preco) {
        this.cod = cod;
        this.preco = preco;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int getCod() {
        return cod;
    }

    public String getDescricao(){
        return "produto: " + getCod() + "preco: " + getPreco();
    }

}
