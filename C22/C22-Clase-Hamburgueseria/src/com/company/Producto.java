package com.company;

public abstract class Producto {
    protected String nombre;

    public Producto(String nombre)
    {

        this.nombre=nombre;
    }
    public abstract String obtenerNombre();
    public abstract  double obtenerPrecio();
    public abstract  String mostrar();
}