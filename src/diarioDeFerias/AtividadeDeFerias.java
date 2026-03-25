package diarioDeFerias;

import java.util.Objects;

public class AtividadeDeFerias {

    private long descricao;
    private long nota;
    private String tag;

    public AtividadeDeFerias(long descricao, long nota, String tag) {
        this.descricao = descricao;
        this.nota = nota;
        this.tag = tag;
    }

    public long getDescricao() {
        return descricao;
    }

    public long getNota() {
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
}
