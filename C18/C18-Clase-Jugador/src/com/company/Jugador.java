package com.company;

public class Jugador {
    private String nombre_y_apellido;
    private int nroCamiseta;
    private String posicion;

    public Jugador(String nombre_y_apellido, int nroCamiseta, String posicion)
    {
        this.nombre_y_apellido = nombre_y_apellido;
        this.nroCamiseta = nroCamiseta;
        this.posicion = posicion;
    }

    public String getNombre_y_apellido() {
        return nombre_y_apellido;
    }

    public int getNroCamiseta() {
        return nroCamiseta;
    }
    public String getPosicion() {
        return posicion;
    }
}