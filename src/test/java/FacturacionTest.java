
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
    public void seCreaUnaFacturaSeLeAgregaUnaLlamadaLocalDiaHabilYDevuelveSuFacturacion(){
        double costoMinuto = 0.2;
        double minutosLLamada = 10;
        double abonoMensual = 250;
        Factura factura = new Factura(abonoMensual);

        DiasHabiles diasHabiles = new DiasHabiles();
        LlamadaLocal llamada = new LlamadaLocal(diasHabiles, minutosLLamada);

        factura.agregarLlamada(llamada);

        assertEquals(abonoMensual + costoMinuto * minutosLLamada, factura.facturacion());
    }

    @Test
    public void seCreaUnaFacturaSeLeAgregaUnaLlamadaLocalDiaNoHabilYDevuelveSuFacturacion(){
        double costoMinuto = 0.1;
        double minutosLLamada = 10;
        double abonoMensual = 250;
        Factura factura = new Factura(abonoMensual);

        DiasNoHabiles diasNoHabiles = new DiasNoHabiles();
        LlamadaLocal llamada = new LlamadaLocal(diasNoHabiles, minutosLLamada);

        factura.agregarLlamada(llamada);

        assertEquals(abonoMensual + costoMinuto * minutosLLamada, factura.facturacion());
    }
}
