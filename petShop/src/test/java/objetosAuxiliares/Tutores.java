package objetosAuxiliares;

import org.example.auxiliares.Cpf;
import org.example.auxiliares.Email;
import org.example.entities.Pet;
import org.example.entities.Tutor;

import java.util.List;

public class Tutores {

    public static Tutor baseTutor = new Tutor(
            "Tutor",
            new Cpf("11111111111"),
            new Email("teste@gmail.com"),
            "35999772621",
            List.of(new Pet())
    );
}
