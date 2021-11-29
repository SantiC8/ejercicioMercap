
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class FacturacionTest {

    @Test
    public void seCreaUnaFacturaYDevuelveSuFacturacion(){
        double abonoMensual = 250;
        Factura factura = new Factura(abonoMensual);

        assertEquals(abonoMensual, factura.facturacion());
    }

    @Test
    public void seCreaUnaFacturaSeLeAgregaUnaLlamadaLocalYDevuelveSuFacturacion(){
        double costoMinuto = 0.2;
        double minutosLLamada = 10;
        double abonoMensual = 250;
        Factura factura = new Factura(abonoMensual);

        LlamadaLocal llamada = new LlamadaLocal(costoMinuto, minutosLLamada);

        factura.agregarLlamada(llamada);

        assertEquals(abonoMensual + costoMinuto * minutosLLamada, factura.facturacion());
    }
}
