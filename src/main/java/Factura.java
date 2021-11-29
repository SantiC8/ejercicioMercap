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
        System.out.println("El costo de la factura es: $" + (abonoMensual + costoLlamadas));
        return abonoMensual + costoLlamadas;
    }

    public void agregarLlamada(Llamada llamada) {
        llamadas.add(llamada);
    }
}
