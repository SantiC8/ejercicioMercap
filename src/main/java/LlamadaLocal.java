public class LlamadaLocal implements Llamada{

    private FranjaHoraria franjaHoraria;
    private double minutosLLamada;

    public LlamadaLocal(FranjaHoraria franjaHoraria, double minutosLLamada) {
        this.franjaHoraria = franjaHoraria;
        this.minutosLLamada = minutosLLamada;
    }

    @Override
    public double costoLlamada() {
        return franjaHoraria.costoLlamada(minutosLLamada);
    }

}
