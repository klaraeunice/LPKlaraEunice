package diarioDeFerias;

import java.util.Objects;

public class AtividadeDeFerias implements Comparable<AtividadeDeFerias> {

    private String descricao;
    private double nota;
    private String tag;

    public AtividadeDeFerias(String descricao, double nota, String tag) {
        this.descricao = descricao;
        this.nota = nota;
        this.tag = tag;
    }

    public String getDescricao() {
        return descricao;
    }

    public double getNota() {
        return nota;
    }

    public String getTag() {
        return tag;
    }

    @Override
    public String toString() {
        return "AtividadeDeFerias{" +
                "\ndescricao: =" + descricao +
                ",\nnota=" + nota +
                ",\ntag='" + tag + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        AtividadeDeFerias that = (AtividadeDeFerias) o;
        return descricao == that.descricao && nota == that.nota && Objects.equals(tag, that.tag);
    }

    @Override
    public int hashCode() {
        return Objects.hash(descricao, nota, tag);
    }

    @Override
    public int compareTo(AtividadeDeFerias outra) {
        if (this.nota < outra.nota) return 1;
        if (this.nota > outra.nota) return -1;
        return 0;    }
}
