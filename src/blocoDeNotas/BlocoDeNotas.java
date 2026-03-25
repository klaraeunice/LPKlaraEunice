package blocoDeNotas;

import java.util.ArrayList;
import java.util.Objects;

public class BlocoDeNotas {
     private ArrayList<Anotacao> anotacoes;
    
    private int contadorIds;

    
    public BlocoDeNotas() {
        this.anotacoes = new ArrayList<>();
        this.contadorIds = 1;
    }

    
    public void adicionaAnotacao(String texto) throws TextoInvalidoException {

        if(texto == null || texto.trim().isEmpty()) {
            throw new TextoInvalidoException("O texto não pode estar vazio");
        }
            Anotacao nova = new Anotacao(texto, contadorIds++);
            if (texto != null) {
                anotacoes.add(nova);
            }
    }

    public void editaAnotacao(int id, String texto) throws TextoInvalidoException, AnotacaoNaoEncontradaException {

        if (texto == null || texto.trim().isEmpty()){
            throw new TextoInvalidoException("O texto não pode estar vazio.");
        }
        for (Anotacao nota : anotacoes) {
            if (nota.getId() == id && !nota.isRemovida()) {
                nota.setTexto(texto);
                return;
            }
        }
        throw new AnotacaoNaoEncontradaException(String.valueOf(id));
    }

    
    public void removeAnotacao(int id) throws AnotacaoNaoEncontradaException{
        for (Anotacao nota : anotacoes) {
            if (nota.getId() == id & !nota.isRemovida()) {
                nota.remove();
                return;
            }
        }
        throw new AnotacaoNaoEncontradaException("Anotação não encontrada");

    }

    public String listaAnotacao() throws ListaVaziaException {
        StringBuilder sb = new StringBuilder();
        boolean temNotaAtiva = false;
        
        for (Anotacao nota : anotacoes) {
            if (!nota.isRemovida()) {
                sb.append(nota.toString()).append("\n");
                temNotaAtiva = true;
            }
        }
        
        if (!temNotaAtiva) {
            throw new ListaVaziaException("Nenhuma anotação encontrada.");
        }
        
        return sb.toString();
    }

    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        BlocoDeNotas that = (BlocoDeNotas) obj;
        return Objects.equals(anotacoes, that.anotacoes);
    }

    
    @Override
    public int hashCode() {
        return Objects.hash(anotacoes);
    }

    
    @Override
    public String toString() {
        return "BlocoDeNotas.BlocoDeNotas com " + anotacoes.size() + " anotações (incluindo removidas).";
    }
}
