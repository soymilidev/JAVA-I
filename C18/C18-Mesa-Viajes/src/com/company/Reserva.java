package com.company;

public class Reserva {
    private String codigo;
    private int cantidadViajeros;
    private String estacionOrigen;
    private String estacionDestino;

    public double calcularPrecioReserva()
    {
        double precio = 50 * cantidadViajeros;
        if(recorridoCompleto()) //si me descuentan el 20% significa que me quedo con el 80%
            precio = precio * 0.8;

        return precio;
    }

    private boolean recorridoCompleto(){

        return estacionOrigen == "BUENOS AIRES" && estacionDestino == "BRAGADO";
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public int getCantidadViajeros() {
        return cantidadViajeros;
    }

    public void setCantidadViajeros(int cantidadViajeros) {
        this.cantidadViajeros = cantidadViajeros;
    }

    public String getEstacionOrigen() {
        return estacionOrigen;
    }

    public void setEstacionOrigen(String estacionOrigen) {
        this.estacionOrigen = estacionOrigen;
    }

    public String getEstacionDestino() {
        return estacionDestino;
    }

    public void setEstacionDestino(String estacionDestino) {
        this.estacionDestino = estacionDestino;
    }
}