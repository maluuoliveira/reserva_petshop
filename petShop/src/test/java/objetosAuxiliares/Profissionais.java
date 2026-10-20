package objetosAuxiliares;

import org.example.entities.Profissional;
import org.example.entities.Veterinario;
import org.example.enuns.Especializacao;
import org.example.enuns.Formacao;
import org.example.enuns.TipoProfissional;

public class Profissionais {

    public static Profissional cirurgiao = new Veterinario(
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

    public static Profissional clinicoGeral = new Veterinario(
            "Nome",
            TipoProfissional.VETERINARIO,
            "35999772621",
            Profissional.SALARIO_MINIMO,
            25,
            "16572027635",
            Formacao.MEDICINA_VETERINARIA,
            "123",
            Especializacao.CLINICO_GERAL
    );


}
