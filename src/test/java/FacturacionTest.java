

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

    @Test
    public void seCreaUnaFacturaSeLeAgreganLlamadasYDevuelveSuFacturacion(){
        double minutosLLamada = 10;
        double abonoMensual = 250;
        Factura factura = new Factura(abonoMensual);

        DiasNoHabiles diasNoHabiles = new DiasNoHabiles();
        LlamadaLocal llamadaLocalNoHabil = new LlamadaLocal(diasNoHabiles, minutosLLamada);
        DiasHabiles diasHabiles = new DiasHabiles();
        LlamadaLocal llamadaLocalHabil = new LlamadaLocal(diasHabiles, minutosLLamada);
        LlamadaNacional llamadaNacional = new LlamadaNacional(0.5, minutosLLamada);
        LlamadaInternacional llamadaInternacional = new LlamadaInternacional(0.8, minutosLLamada);

        factura.agregarLlamada(llamadaLocalHabil);
        factura.agregarLlamada(llamadaLocalNoHabil);
        factura.agregarLlamada(llamadaNacional);
        factura.agregarLlamada(llamadaInternacional);

        double costoLlamadas = llamadaInternacional.costoLlamada() + llamadaLocalHabil.costoLlamada() +
                llamadaNacional.costoLlamada() + llamadaLocalNoHabil.costoLlamada();

        assertEquals(abonoMensual + costoLlamadas, factura.facturacion());
    }
}
