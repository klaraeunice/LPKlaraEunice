package petshop;

import java.time.LocalDate;

class Tosa extends Servico{
    public Tosa(String cod, LocalDate data, TamanhoAnimal tamanho) {
        super(cod, data, tamanho);
    }


    @Override
    public double calcularPreco() {
        return tamanhoAnimal.valorTosa;
    }
}
