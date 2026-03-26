package simuladoProva3;

public class Eletronico extends Produto{

    private int voltagem;
    private boolean garantia;

    public Eletronico(int cod, double preco, int voltagem, boolean garantia){
        super(cod, preco);
        this.voltagem = voltagem;
        this.garantia = garantia;

    }

    public String getGarantia(){
        if (garantia){
            return "Sim";
        }
        return "Não";
    }
    @Override
    public String getDescricao() {
        return super.getDescricao() + "Voltagem: " + this.voltagem + "V " + "Garantia: " + getGarantia();
    }
}
