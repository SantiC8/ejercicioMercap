public class LlamadaNacional implements Llamada{

    private double costoMinutoLocalidad;
    private double minutosLLamada;

    public LlamadaNacional(double costoMinutoLocalidad, double minutosLLamada) {
        this.costoMinutoLocalidad = costoMinutoLocalidad;
        this.minutosLLamada = minutosLLamada;
    }
    @Override
    public double costoLlamada() {
        return costoMinutoLocalidad * minutosLLamada;
    }
}
