import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LlamadasTest {

    @Test
    public void seCreaUnaLlamadaLocalConDiaHabilYDevuelveSuCosto(){
        double costoMinuto = 0.2;
        double minutosLLamada = 10;
        DiasHabiles diasHabiles = new DiasHabiles();

        LlamadaLocal llamada = new LlamadaLocal(diasHabiles, minutosLLamada);

        assertEquals(costoMinuto* minutosLLamada, llamada.costoLlamada());
    }

    @Test
    public void seCreaUnaLlamadaLocalConDiaNoHabilYDevuelveSuCosto(){
        double costoMinuto = 0.1;
        double minutosLLamada = 10;
        DiasNoHabiles diasNoHabiles = new DiasNoHabiles();

        LlamadaLocal llamada = new LlamadaLocal(diasNoHabiles, minutosLLamada);

        assertEquals(costoMinuto* minutosLLamada, llamada.costoLlamada());
    }

}
