package registroDelAutomotor;

public abstract class Vehiculo {
    private String fecha;
    private Double cotizacion;
    private String marca;
    private String patente;
    private Boolean industriaNacional;

    /*
    Dueño dueño;

    public Vehiculo(Dueño dueño) {
        this.dueño = dueño;
    }
    */

    Dueno dueno;

    public Vehiculo(Dueno dueno) {
        this.dueno = dueno;
    }
    public Vehiculo(String fecha, Double cotizacion, String marca, String patente, Boolean industriaNacional) {
        this.fecha = fecha;
        this.cotizacion = cotizacion;
        this.marca = marca;
        this.patente = patente;
        this.industriaNacional = industriaNacional;
    }

    public Boolean esIndustriaNacional()
    {
        return industriaNacional;
    }

}