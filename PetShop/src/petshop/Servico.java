package petshop;

import java.time.LocalDate;

interface ServicoInterface {

    double calcularPreco ();

}

abstract class Servico implements ServicoInterface{
    protected String codigo;
    protected LocalDate data;
    protected TamanhoAnimal tamanhoAnimal;


    public Servico(String codigo, LocalDate data, TamanhoAnimal tamanhoAnimal) {
        this.codigo = codigo;
        this.data = data;
        this.tamanhoAnimal = tamanhoAnimal;
    }


    public String getCodigo() {
        return codigo;
    }

    public LocalDate getData() {
        return data;
    }

    public TamanhoAnimal getTamanhoAnimal() {
        return tamanhoAnimal;
    }
}
