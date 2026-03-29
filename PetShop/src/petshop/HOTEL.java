package petshop;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class HOTEL extends Servico {

    public LocalDateTime horas;

    public HOTEL(int cod, LocalDate data, TAMANHO tamanho, double preco) {
        super(cod, data, tamanho, preco);
    }
}
