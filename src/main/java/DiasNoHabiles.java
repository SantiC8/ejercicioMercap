
public class DiasNoHabiles implements FranjaHoraria {
    private double costoMinuto;

    public DiasNoHabiles(){
        this.costoMinuto = 0.1;
    }

    @Override
    public double costoLlamada(double minutosLlamada) {
        return costoMinuto * minutosLlamada;
    }
}
