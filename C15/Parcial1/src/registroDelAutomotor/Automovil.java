package registroDelAutomotor;

public class Automovil extends Vehiculo{
    private Boolean esAGas;
    private int cilindrada;

    public Automovil(String fecha, Double cotizacion, String marca, String patente, Boolean industriaNacional, Boolean esAGas, int cilindrada) {
        super(fecha, cotizacion, marca, patente, industriaNacional);
        this.esAGas = esAGas;
        this.cilindrada = cilindrada;
    }

    public Boolean esEconomico(){
        if (esAGas ||  cilindrada<1200)
            return true;
        else
            return false;
    }
}