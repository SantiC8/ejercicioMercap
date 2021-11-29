
public class LlamadaInternacional implements Llamada{

    private double costoMinutoPais;
    private double minutosLLamada;

    public LlamadaInternacional(double costoMinutoPais, double minutosLLamada) {
        this.costoMinutoPais = costoMinutoPais;
        this.minutosLLamada = minutosLLamada;
    }
    @Override
    public double costoLlamada() {
        return costoMinutoPais*minutosLLamada;
    }
}
