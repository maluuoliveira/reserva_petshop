package entities;

import org.example.entities.Veterinario;
import org.example.entities.Profissional;
import org.example.enuns.Especializacao;
import org.example.enuns.Formacao;
import org.example.enuns.TipoProfissional;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class VeterinarioTest {


    private Veterinario veterinario;

    @BeforeEach
    public void init() {
        veterinario = new Veterinario(
                "Nome",
                TipoProfissional.VETERINARIO,
                "35999772621",
                Profissional.SALARIO_MINIMO,
                25,
                "16572027635",
                Formacao.MEDICINA_VETERINARIA,
                "123",
                Especializacao.CIRURGIAO
        );
    }

    @Test
    public void createVeterinario() {
        assertNotNull(veterinario);
    }

    @Test
    public void createVeterinarioFormacaoInvalida() {
        assertThrows(IllegalArgumentException.class, () ->
                new Veterinario(
                        "Nome",
                        TipoProfissional.VETERINARIO,
                        "35999772621",
                        Profissional.SALARIO_MINIMO,
                        25,
                        "16572027635",
                        Formacao.ADMINISTRACAO,
                        "123",
                        null
                )
        );
    }

    @Test
    public void validaFormacaoMedicinaVeterinaria (){
        assertEquals(
                Formacao.MEDICINA_VETERINARIA,
                veterinario.validaFormacao(Formacao.MEDICINA_VETERINARIA)
        );
    }

    @Test
    public void crmvInvalido (){
        assertThrows(IllegalArgumentException.class, () ->
                new Veterinario(
                        "Nome",
                        TipoProfissional.VETERINARIO,
                        "35999772621",
                        Profissional.SALARIO_MINIMO,
                        25,
                        "16572027635",
                        Formacao.MEDICINA_VETERINARIA,
                        null,
                        Especializacao.CIRURGIAO
                )
        );
    }

    @Test
    public void buscaCrmvVeterinario (){
        assertEquals("123", veterinario.getCrmv());
    }

    @Test
    public void setCrmvVeterinario(){
        veterinario.setCrmv("22");
        assertEquals("22", veterinario.getCrmv());
    }
}
