package com.company;

public class SocioHabilitado extends Socio {
    private Double costoPileta;
    private Boolean habilitado;

    //primero necesito crear al Socio, para eso lo tengo que crear en el constructor de Socio habilitado.

    public SocioHabilitado(String numero, String nombre, String actividad, Double cuota, Double costoPileta, Boolean habilitado) {
        super(numero, nombre, actividad, cuota);
        this.costoPileta = costoPileta;
        this.habilitado = habilitado;
    }

    @Override
    public Double calcularCostoMensual()
    {
        //return getCuotaMensual()+costoPileta;
        return super.calcularCostoMensual() + costoPileta;
    }

    @Override
    public String toString() {
        return "costoPileta: " + costoPileta + '\n' +
                "habilitado: " + habilitado + '\n'
                ;
    }
}