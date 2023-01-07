package com.company;

public class Caja extends Producto {
    private double longitud;
    private double ancho;
    private double altura;

    /*
    public Caja() {
        super(0.0);
        longitud = 10.0;
        ancho = 10.0;
        altura = 10.0;
    }
    */

    public Caja(double peso, double longitud, double ancho, double altura) {
        super(peso);
        this.longitud = longitud;
        this.ancho = ancho;
        this.altura = altura;
    }

    @Override
    public Double calcularEspacio() {
        return longitud*ancho*altura;
    }
}
