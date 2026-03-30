package petshop;

import java.time.LocalDate;

class Hotel extends Servico {

    private int horas;

    public Hotel(String cod, LocalDate data, TamanhoAnimal tamanho, int horas) {
        super(cod, data, tamanho);
        this.horas = horas;
    }

    @Override

    public double calcularPreco(){
        return tamanhoAnimal.valorHoraHotel * horas;
    }
}
