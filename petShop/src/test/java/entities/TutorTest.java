package entities;

import objetosAuxiliares.Tutores;
import org.example.auxiliares.Cpf;
import org.example.auxiliares.Email;
import org.example.entities.Pet;
import org.example.entities.Tutor;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class TutorTest {

    Tutor baseTutor = Tutores.baseTutor;

    @Test
    public void createTutor(){
        Tutor tutor =  baseTutor;
        assertNotNull(tutor);
    }

    @Test
    public void createTutorEmailInvalido(){
        assertThrows(IllegalArgumentException.class, ()->{
            new Tutor(
                    "Invalido",
                    new Cpf("11111111111"),
                    new Email("email.com"),
                    "35999772621",
                    List.of(new Pet())
            );
        });
    }
}
