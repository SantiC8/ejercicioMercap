
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class FacturacionTest {

    @Test
    public void seCreaUnaFacturaYDevuelveSuFacturacion(){
        double abonoMensual = 250;
        Factura factura = new Factura(abonoMensual);

        assertEquals(abonoMensual, factura.facturacion());
    }
}
