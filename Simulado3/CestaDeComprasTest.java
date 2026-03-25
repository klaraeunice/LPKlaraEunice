package Simulado3;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CestaDeComprasTest {

    private CestaDeCompras cesta;

    @BeforeEach
    void setUp() {
        // Inicializa uma cesta vazia antes de cada teste
        cesta = new CestaDeCompras();
    }

    @Test
    void testeAdicionarProduto() {
        Livro livro = new Livro(1, 50.0, "Java 101", "Deitel");

        // Verifica se o método retorna true ao adicionar
        assertTrue(cesta.adicionarProduto(livro));

        // Verifica se ele recusa um produto nulo
        assertFalse(cesta.adicionarProduto(null));
    }

    @Test
    void testeCalcularPrecoTotal() {
        // Cenário com dois produtos diferentes (Polimorfismo em ação)
        Livro l = new Livro(1, 50.0, "Livro A", "Autor A");
        Eletronico e = new Eletronico(2, 150.0, 110, true);

        cesta.adicionarProduto(l);
        cesta.adicionarProduto(e);

        // O total deve ser exatamente 200.0
        // O 0.001 é a margem de erro aceitável para números decimais
        assertEquals(200.0, cesta.calcularPrecoTotal(), 0.001);
    }

    @Test
    void testeListarProdutos() {
        Livro l = new Livro(1, 50.0, "Harry Potter", "J.K. Rowling");
        cesta.adicionarProduto(l);

        String resultado = cesta.listarProdutos();

        // Verifica se a string final contém partes cruciais da descrição
        assertTrue(resultado.contains("Harry Potter"));
        assertTrue(resultado.contains("J.K. Rowling"));
        assertTrue(resultado.contains("50.0"));
    }
}