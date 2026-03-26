package blocoDeNotas;

public class Main {
    public static void main(String[] args) {
        BlocoDeNotas bloco = new BlocoDeNotas();


        bloco.adicionaAnotacao("Anotar a anotação");
        bloco.adicionaAnotacao("Comprar ração para o gato");

        System.out.println(bloco.listaAnotacao());

        bloco.editaAnotacao(1, "Estudar para a prova de OO e Java");

        bloco.removeAnotacao(2);

        System.out.println("--- Após alterações ---");
        System.out.println(bloco.listaAnotacao());
    }
}
