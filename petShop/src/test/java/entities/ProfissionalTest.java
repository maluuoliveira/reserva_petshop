package entities;

import org.example.entities.Cirurgiao;
import org.example.entities.Profissional;
import org.example.enuns.Formacao;
import org.example.enuns.TipoProfissional;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.*;

public class ProfissionalTest {

    private Profissional baseProfissional;

    @BeforeEach
    public void init() {
        baseProfissional = new Cirurgiao(
                "Nome",
                TipoProfissional.CIRURGIAO,
                "35999772621",
                new BigDecimal("2000.00"),
                25,
                "16572027635",
                Formacao.MEDICINA_VETERINARIA,
                "123"
        );
    }


    @Test
    void deveAumentarSalarioQuandoNovoSalarioForMaior() {
        Profissional profissional = baseProfissional;

        profissional.reajusteSalarial(new BigDecimal("2500.00"));

        assertEquals(
                0,
                new BigDecimal("2500.00")
                        .compareTo(profissional.getSalario())
        );
    }

    @Test
    void deveReduzirSalarioQuandoNovoSalarioForMenor() {
        Profissional profissional = baseProfissional;

        profissional.reajusteSalarial(new BigDecimal("1800.00"));

        assertEquals(
                0,
                new BigDecimal("1800.00")
                        .compareTo(profissional.getSalario())
        );
    }

    @Test
    void naoDeveAlterarSalarioQuandoValoresForemIguais() {
        Profissional profissional = baseProfissional;

        profissional.reajusteSalarial(new BigDecimal("2000.00"));

        assertEquals(
                0,
                new BigDecimal("2000.00")
                        .compareTo(profissional.getSalario())
        );
    }

    @Test
    void deveLancarExcecaoQuandoNovoSalarioForNulo() {
        Profissional profissional = baseProfissional;

        IllegalArgumentException excecao = assertThrows(
                IllegalArgumentException.class,
                () -> profissional.reajusteSalarial(null)
        );

        assertEquals(
                "Salario não cadastrado",
                excecao.getMessage()
        );
    }

    @Test
    void deveLancarExcecaoQuandoSalarioForMenorQueMinimo() {
        Profissional profissional = baseProfissional;

        IllegalArgumentException excecao = assertThrows(
                IllegalArgumentException.class,
                () -> profissional.reajusteSalarial(
                        new BigDecimal("1500.00")
                )
        );

        assertEquals(
                "O salario não pode ser menor do que o salário minimo.",
                excecao.getMessage()
        );
    }

}
