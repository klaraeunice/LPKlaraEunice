package Simulado3;

import java.util.ArrayList;
import  java.util.List;

public class CestaDeCompras {

    private List<Produto> itens;

    public CestaDeCompras() {
        this.itens = new ArrayList<>();
    }

    public boolean adicionarProduto(Produto produto){
        if (produto != null){
            this.itens.add(produto);
            return true;
        }
        return false;
    }

    public String listarProdutos(){
        StringBuilder listaCompleta = new StringBuilder();

        for (Produto p : itens){
            listaCompleta.append(p.getDescricao()).append("Preço: R$ ").append(p.getPreco()).append("\n");

        }
        return listaCompleta.toString();
    }

    public double calcularPrecoTotal(){
        double precoTotal = 0;

        for (Produto p : itens){
            precoTotal += p.getPreco();
        }
        return precoTotal;
    }
}
