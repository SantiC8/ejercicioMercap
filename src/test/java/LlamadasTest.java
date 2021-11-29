import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LlamadasTest {

    @Test
    public void seCreaUnaLLamadaLocalYDevuelveSuCosto(){
        double costoMinuto = 0.2;
        double minutosLLamada = 10;

        LlamadaLocal llamada = new LlamadaLocal(costoMinuto, minutosLLamada);

        assertEquals(costoMinuto* minutosLLamada, llamada.costoLlamada());
    }

}
