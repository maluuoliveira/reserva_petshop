package entities;

import org.example.entities.Cirurgiao;
import org.example.enuns.Formacao;
import org.example.enuns.TipoProfissional;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CirurgiaoTest {


    private Cirurgiao cirurgiao;

    @BeforeEach
    public void init() {
        cirurgiao = new Cirurgiao(
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
    public void createCirurgiao() {
        assertNotNull(cirurgiao);
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

    @Test
    public void validaFormacaoMedicinaVeterinaria (){
        assertEquals(
                Formacao.MEDICINA_VETERINARIA,
                cirurgiao.validaFormacao(Formacao.MEDICINA_VETERINARIA)
        );
    }
}
