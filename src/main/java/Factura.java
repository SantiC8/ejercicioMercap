import java.util.ArrayList;

public class Factura {

    private double abonoMensual;
    private ArrayList<Llamada> llamadas;

    public Factura(double abonoMensual) {
        this.abonoMensual = abonoMensual;
        this.llamadas = new ArrayList<>();
    }

    public double facturacion(){
        double costoLlamadas = 0;
        for(Llamada llamada : llamadas) costoLlamadas += llamada.costoLlamada();
        return abonoMensual + costoLlamadas;
    }

    public void agregarLlamada(LlamadaLocal llamada) {
        llamadas.add(llamada);
    }
}
