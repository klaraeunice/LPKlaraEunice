package petshop;

import java.util.ArrayList;
import java.util.List;

 class Inventario {
     private List<Servico> servicos;

     public Inventario(){
         this.servicos = new ArrayList<>();
     }

     public void adicionarServico(Servico s) {
         servicos.add(s);
     }

     public double calcularFaturamentoTotal() {
         return servicos.stream().mapToDouble(Servico::calcularPreco).sum();
     }

     public void listarServicos() {
         for (Servico s : servicos) {
             System.out.println("Cód: " + s.getCodigo() +
                     " | Tipo: " + s.getClass().getSimpleName() +
                     " | Valor: R$ " + s.calcularPreco());
         }
     }
}
