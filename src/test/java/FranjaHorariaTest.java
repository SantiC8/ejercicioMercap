import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FranjaHorariaTest {
    @Test
    public void seCreaUnaFranjaHorariaDiasHabilesRecibeMinutosYDevuelveSuCosto(){
        double costoMinuto = 0.2;
        double minutosLLamada = 10;

        DiasHabiles diasHabiles = new DiasHabiles();

        assertEquals(costoMinuto * minutosLLamada, diasHabiles.costoLlamada(minutosLLamada));
    }

    @Test
    public void seCreaUnaFranjaHorariaDiasNoHabilesRecibeMinutosYDevuelveSuCosto(){
        double costoMinuto = 0.1;
        double minutosLLamada = 10;

        DiasNoHabiles diasNoHabiles = new DiasNoHabiles();

        assertEquals(costoMinuto * minutosLLamada, diasNoHabiles.costoLlamada(minutosLLamada));
    }

}
