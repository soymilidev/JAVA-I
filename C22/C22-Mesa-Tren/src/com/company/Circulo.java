package com.company;

public class Circulo implements FiguraGeometrica {
    private double radio;

    public Circulo(double radio) {
        this.radio = radio;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    @Override
    public String mostrar() {
        return "Figura: circulo";
    }

    @Override
    //Reducir a 2 decimales
    public double calcularArea() {
        return Math.round(Math.pow(radio, 2)*Math.PI * 100.0) / 100.0;
    }
    //public double calcularArea() {return Math.pow(radio, 2)*Math.PI;}
}