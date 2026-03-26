package blocoDeNotas;

import java.time.LocalDateTime;
import java.util.Objects;
import java.time.format.DateTimeFormatter;

public class Anotacao {
    
    private String texto;
    private int id;
    private LocalDateTime data;
    private boolean removida;

    public Anotacao(String texto, int id) {
        this.texto = texto;
        this.id = id;
        this.data = LocalDateTime.now(); 
        this.removida = false;
    }

    // Getters e Setters
    public void setTexto(String texto) {
        this.texto = texto;
    }

    public String getTexto() {
        return texto;
    }

    public LocalDateTime getDataDeCriacao() {
        return data;
    }

    public int getId() {
        return id;
    }

    public void remove() {
        this.removida = true;
    }

    public boolean isRemovida() {
        return removida;
    }

  
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Anotacao anotacao = (Anotacao) obj;
        return id == anotacao.id; 
    }

  
    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

  
    @Override
    public String toString() {
      
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
        return "ID: " + id + " | Data: " + data.format(formatter) + " | Texto: " + texto;
    }
}
