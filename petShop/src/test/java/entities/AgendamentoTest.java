package entities;

import objetosAuxiliares.Pets;
import objetosAuxiliares.Profissionais;
import objetosAuxiliares.Recintos;
import objetosAuxiliares.Servicos;
import org.example.entities.*;
import org.example.enuns.*;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class AgendamentoTest {

    Servico servicoCirurgia = Servicos.servicoCirurgia;
    Recinto recintoCirurgia = Recintos.recintoCirurgia;
    Pet outroAnimal = Pets.outroAnimal;
    Profissional profissionalCirurgia = Profissionais.cirurgiao;
    Profissional clinicoGeral = Profissionais.clinicoGeral;

    @Test
    void confirmarAgendamentoCirurgia (){
        Agendamento agendamentoCirurgia = new Agendamento(
                servicoCirurgia,
                recintoCirurgia,
                profissionalCirurgia,
                outroAnimal
        );
        agendamentoCirurgia.confirmarAgendamento(agendamentoCirurgia);
    }

    @Test
    void confirmarAgendamentoCirurgiaComVetrinarioNaoCirurgiao (){
        Agendamento agendamentoCirurgia = new Agendamento(
                servicoCirurgia,
                recintoCirurgia,
                clinicoGeral,
                outroAnimal
        );
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () ->
                agendamentoCirurgia.confirmarAgendamento(agendamentoCirurgia));

        assertEquals("O veterinário selecionado não é um cirurgião", exception.getMessage());
    }
}
