
public class DiasHabiles implements FranjaHoraria{
    private double costoMinuto;

    public DiasHabiles(){
        this.costoMinuto = 0.2;
    }

    @Override
    public double costoLlamada(double minutosLlamada) {
        return costoMinuto * minutosLlamada;
    }
}
