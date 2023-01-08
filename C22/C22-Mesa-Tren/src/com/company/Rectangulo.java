package com.company;

public class Rectangulo implements FiguraGeometrica {
    private double alto;
    private double largo;

    public Rectangulo(double alto, double largo) {
        this.alto = alto;
        this.largo = largo;
    }

    @Override
    public String mostrar() {
        return "Figura: rectangulo";
    }

    @Override
    public double calcularArea() {
        return alto * largo;
    }
}