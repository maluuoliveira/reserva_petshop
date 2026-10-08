package entities;

import org.example.entities.Cirurgiao;
import org.example.enuns.Formacao;
import org.example.enuns.TipoProfissional;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class CirurgiaoTest {

    @Test
    public void createCirurgiao() {
        Cirurgiao cirurgiao = new Cirurgiao(
                "Nome",
                TipoProfissional.CIRURGIAO,
                "35999772621",
                25,
                "16572027635",
                Formacao.MEDICINA_VETERINARIA,
                "123"
        );
    }

    @Test
    public void createCirurgiaoSemFormacao() {
        assertThrows(IllegalArgumentException.class, () ->
            new Cirurgiao(
                "Nome",
                TipoProfissional.CIRURGIAO,
                "35999772621",
                25,
                "16572027635",
                null,
                "123"
            )
        );
    }


    @Test
    public void createCirurgiaoFormacaoInvalida() {
        assertThrows(IllegalArgumentException.class, () ->
                new Cirurgiao(
                        "Nome",
                        TipoProfissional.CIRURGIAO,
                        "35999772621",
                        25,
                        "16572027635",
                        Formacao.ADMINISTRACAO,
                        "123"
                )
        );
    }
}
