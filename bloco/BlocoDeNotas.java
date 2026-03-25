package bloco;

import java.util.ArrayList;
import java.util.Objects;

public class BlocoDeNotas {
     private ArrayList<Anotacao> anotacoes;
    
    private int contadorIds;

    
    public BlocoDeNotas() {
        this.anotacoes = new ArrayList<>();
        this.contadorIds = 1;
    }

    
    public void adicionaAnotacao(String texto) {
        Anotacao nova = new Anotacao(texto, contadorIds++);
        anotacoes.add(nova);
    }

    public void editaAnotacao(int id, String texto) {
        for (Anotacao nota : anotacoes) {
            if (nota.getId() == id && !nota.isRemovida()) {
                nota.setTexto(texto);
                return; 
        }
    }

    
    public void removeAnotacao(int id) {
        for (Anotacao nota : anotacoes) {
            if (nota.getId() == id) {
                nota.remove();
              return;
            }
        }
    }

    public String listaAnotacao() {
        StringBuilder sb = new StringBuilder();
        
        for (Anotacao nota : anotacoes) {
            if (!nota.isRemovida()) {
                sb.append(nota.toString()).append("\n");
            }
        }
        
        if (sb.length() == 0) {
            return "Nenhuma anotação encontrada.";
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
        return "bloco.BlocoDeNotas com " + anotacoes.size() + " anotações (incluindo removidas).";
    }
}
