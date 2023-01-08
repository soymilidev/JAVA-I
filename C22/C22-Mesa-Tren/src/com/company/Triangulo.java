package com.company;

public class Triangulo implements FiguraGeometrica {
    private double base;
    private double altura;

    public Triangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    @Override
    public String mostrar() {
        return "Figura: triangulo";
    }

    @Override
    public double calcularArea() {

        return base * altura / 2;
    }

}