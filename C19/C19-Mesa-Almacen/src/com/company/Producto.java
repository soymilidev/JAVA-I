package com.company;

public abstract class Producto {
    private double peso;

    public Producto(double peso) {
        this.peso = peso;
    }

    public abstract Double calcularEspacio();

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }
}