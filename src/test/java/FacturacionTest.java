
import com.tngtech.archunit.core.domain.JavaClasses;
import com.tngtech.archunit.core.importer.ClassFileImporter;
import com.tngtech.archunit.lang.ArchRule;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class FacturacionTest {

    @Test
    public void seCreaClaseFacturaYDevuelveSuFacturacion(){
        float abonoMensual = 250;
        Factura factura = new Factura(abonoMensual);

        assertEquals(abonoMensual, factura.facturacion());
    }
}
