package objetosAuxiliares;

import org.example.entities.Pet;
import org.example.enuns.Especie;
import org.example.enuns.PortePetEnum;
import org.example.enuns.TemperamentoPetEnum;

public class Pets {

    public static Pet outroAnimal = new Pet(
                null,
                null,
                null,
                null,
                Especie.OUTRO,
                "MACACO NARIGUDO",
                null
    );

    public static Pet cachorroBravo = new Pet(
                "Bob",
                null,
                TemperamentoPetEnum.REATIVO,
                PortePetEnum.G,
                Especie.CACHORRO,
                null,
                null
    );
}
