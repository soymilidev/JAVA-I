package com.company;

public class Main {
    public static void main(String[] args) {
        FiguraGeometrica rueda = new Circulo(1);
        FiguraGeometrica baseLocomotora = new Rectangulo(4,6);
        FiguraGeometrica cabinaLocomotora = new Rectangulo(2,4);
        FiguraGeometrica chimeneaLocomotora = new Rectangulo(1,2);
        FiguraGeometrica frenteLocomotora = new Triangulo(2,2);
        FiguraGeometrica cuerpoVagon = new Rectangulo(4,5);

        UnidadCompuesta locomotora = new UnidadCompuesta();
        locomotora.agregarFiguraGeometrica(rueda);
        locomotora.agregarFiguraGeometrica(rueda);
        locomotora.agregarFiguraGeometrica(baseLocomotora);
        locomotora.agregarFiguraGeometrica(cabinaLocomotora);
        locomotora.agregarFiguraGeometrica(chimeneaLocomotora);
        locomotora.agregarFiguraGeometrica(frenteLocomotora);
        System.out.println("Superficie locomotora: " + locomotora.calcularArea());

        UnidadCompuesta vagon1 = new UnidadCompuesta();
        vagon1.agregarFiguraGeometrica(rueda);
        vagon1.agregarFiguraGeometrica(rueda);
        vagon1.agregarFiguraGeometrica(rueda);
        vagon1.agregarFiguraGeometrica(cuerpoVagon);
        System.out.println("Superficie vagon 1: " + vagon1.calcularArea());

        UnidadCompuesta vagon2 = new UnidadCompuesta();
        vagon2.agregarFiguraGeometrica(rueda);
        vagon2.agregarFiguraGeometrica(rueda);
        vagon2.agregarFiguraGeometrica(rueda);
        vagon2.agregarFiguraGeometrica(cuerpoVagon);
        System.out.println("Superficie vagon 2: " + vagon2.calcularArea());

        UnidadCompuesta tren = new UnidadCompuesta();
        tren.agregarFiguraGeometrica(locomotora);
        tren.agregarFiguraGeometrica(vagon1);
        tren.agregarFiguraGeometrica(vagon2);

        System.out.println("Superficie total del tren: " + tren.calcularArea());
    }

}