package com.company;

public class Socio {

    private String numeroSocio;
    private String nombre;
    private Double cuotaMensual;
    private String actividad;

    public Socio(String numero, String nombre, String actividad, Double cuota)
    {
        numeroSocio=numero;
        this.nombre=nombre;
        cuotaMensual=cuota;
        this.actividad=actividad;
    }

    public Double getCuotaMensual() {

        return cuotaMensual;
    }

    public Double calcularCostoMensual()
    {

        return cuotaMensual;
    }



    @Override
    public boolean equals(Object o)
    { if (o==null)
        return false;
    if (! (o instanceof Socio))
       return  false;
    //o casteo para que vea que es socio
    return ((Socio)o).numeroSocio.equals(this.numeroSocio);
    }

    @Override
    public String toString() {
        return "numeroSocio: " + numeroSocio + '\n' +
                "nombre: " + nombre + '\n' +
                "cuotaMensual: " + cuotaMensual + '\n' +
                "actividad: " + actividad + '\n'
                ;
    }
}