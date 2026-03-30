package petshop;

import java.time.LocalDate;

public class Banho extends Servico{

    private TamanhoAnimal.TamanhoPelo tamanhoPelo;

    public Banho(String cod, LocalDate data, TamanhoAnimal tamanho, TamanhoAnimal.TamanhoPelo pelo){
        super(cod,data,tamanho);
        this.tamanhoPelo = pelo;
    }

    @Override
    public double calcularPreco() {
        return tamanhoAnimal.baseBanho + tamanhoPelo.adicional;
    }
}
