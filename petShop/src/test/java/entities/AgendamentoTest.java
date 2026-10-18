package entities;

import org.example.entities.*;
import org.example.enuns.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.*;

public class AgendamentoTest {

    Servico servicoCirurgia;
    Recinto recintoCirurgia;
    Pet pet;
    Profissional profissionalCirurgia;

    @BeforeEach
    public void init (){
         servicoCirurgia = new Servico(
                null,
                null,
                TipoServico.CIRURGIA,
                null
        );

         recintoCirurgia = new Recinto(
                 TipoRecinto.CIRURGIA,
                 null
         );

    }

    @Test
    void realizarAgendamentoCirurgia (){
    }
}
