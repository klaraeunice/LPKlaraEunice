package diarioDeFerias;

import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class MeuDiarioDeFerias {
    private List<AtividadeDeFerias> atividades = new ArrayList<>();

    public void adicionarAtividade(AtividadeDeFerias atividade) throws AtividadeInvalidaException {
        if (atividade != null) {
            this.atividades.add(atividade);
        } else {
            throw new AtividadeInvalidaException("Atividade não pode estar vazia.");
        }
    }

    public void listarAtividades() throws ListaVaziaException {
        if (atividades.isEmpty()) {
            throw new ListaVaziaException("Não há atividades cadastradas.");
        }
        for (AtividadeDeFerias a : atividades) {
            System.out.println(a);
        }
    }

    public void pesquisarAtividade(String tagPesquisada) throws ListaVaziaException {
        if (atividades.isEmpty()) {
            throw new ListaVaziaException("Diario vazio.");
        }
        boolean encontrou = false;

        for (AtividadeDeFerias a : atividades) {
            if (a.getTag().equalsIgnoreCase(tagPesquisada)) {
                System.out.println(a);
                encontrou = true;
            }
        }

        if (!encontrou) {
            System.out.println("Nenhuma atividade encontrada na categoria: " + tagPesquisada);
        }
    }

    public void listarPorNotaMaior() throws ListaVaziaException {
        if (atividades.isEmpty()) {
            throw new ListaVaziaException("Diário vazio");
        }

        Collections.sort(atividades);
        for (AtividadeDeFerias a : atividades) {
            System.out.println("Nota: " + a.getNota() + " - " + a.getDescricao());
        }
    }
}