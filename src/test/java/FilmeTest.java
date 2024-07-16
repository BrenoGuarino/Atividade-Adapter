
import org.example.Filme;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FilmeTest {

    @Test
    void deveRetornarConceitoAluno() {
        Filme filme = new Filme();
        filme.setRecepcao("Excelente");

        assertEquals("Excelente", filme.getRecepcao());
    }

    @Test
    void deveRetornarNotaAluno() {
        Filme filme = new Filme();
        filme.setRecepcao("Excelente");

        assertEquals(5, filme.getNotaNumero());
    }

}