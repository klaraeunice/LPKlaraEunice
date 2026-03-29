package petshop;
import java.time.LocalDate;


public class Servico {
    public int cod;
    public LocalDate data;
    public TAMANHO tamanho;
    public double preco;

    public Servico(int cod, LocalDate data, TAMANHO tamanho, double preco) {
        this.cod = cod;
        this.data = data;
        this.tamanho = tamanho;
        this.preco = preco;
    }



}
