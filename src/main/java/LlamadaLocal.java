public class LlamadaLocal implements Llamada{

    private double costoMinuto;
    private double minutosLLamada;

    public LlamadaLocal(double costoMinuto, double minutosLLamada) {
        this.costoMinuto = costoMinuto;
        this.minutosLLamada = minutosLLamada;
    }

    @Override
    public double costoLlamada() {
        return costoMinuto * minutosLLamada;
    }

}
