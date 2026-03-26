package simuladoProva3;

public class Livro extends Produto{

    private String autor;
    private String editora;

    public Livro(int cod, double preco, String autor, String editora) {
        super(cod, preco);
        this.autor = autor;
        this.editora = editora;
    }

    @Override
    public String getDescricao() {
        return super.getDescricao()+ "autor" + this.autor + "editora: " + this.editora;
    }


}
