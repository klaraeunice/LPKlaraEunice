package petshop;

import java.time.LocalDate;

public class BANHO extends Servico{

    private TAMANHO tamanho;

    public BANHO(int cod, LocalDate data, TAMANHO tamanho, double preco) {
        super(cod, data, tamanho, preco);
    }
}
