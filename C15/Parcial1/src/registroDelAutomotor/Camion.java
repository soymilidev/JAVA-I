package registroDelAutomotor;

public class Camion extends Vehiculo implements Comparable<Camion>{
    private int cantidadEjes;
    private Double capacidadCarga;

    public Camion(String fecha, Double cotizacion, String marca, String patente, boolean industriaNacional, int cantidadEjes, Double capacidadCarga) {
        super(fecha, cotizacion, marca, patente, industriaNacional);
        this.cantidadEjes = cantidadEjes;
        this.capacidadCarga = capacidadCarga;
    }

    @Override
    public int compareTo(Camion o) {
        if(capacidadCarga>o.capacidadCarga)
            return 1;
        else if(capacidadCarga<o.capacidadCarga)
            return -1;
        return 0;
    }

    @Override
    public String toString() {
        return "Camion{" +
                "cantidadEjes=" + cantidadEjes +
                ", capacidadCarga=" + capacidadCarga +
                '}';
    }
}