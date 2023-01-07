package com.company;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Puerto puerto1=new Puerto("Mar del Plata");
        puerto1.agregarContenedor(new Contenedor(92233, "China", false));
        puerto1.agregarContenedor(new Contenedor(91233, "EEUU", true));
        puerto1.agregarContenedor(new Contenedor(90233, "Brasil", false));
        puerto1.agregarContenedor(new Contenedor(96233, "Rusia", true));
        puerto1.agregarContenedor(new Contenedor(98233, "Canadá", false));
        puerto1.agregarContenedor(new Contenedor(94233, "Desconocida", true));
        puerto1.agregarContenedor(new Contenedor(82233, "Desconocida", true));

        System.out.println("Mostramos los contenedores ingresados al puerto de " +  puerto1.getNombre() + ": ");
        puerto1.mostrarContenedores();
        System.out.println("--------------------------------------------------------------------------------------------");

        System.out.println("Mostramos los contenedores ingresados al puerto de " +  puerto1.getNombre() + " ordenados por ID: ");
        puerto1.mostrarContenedoresOrdenadosPorId();
        System.out.println("--------------------------------------------------------------------------------------------");

        System.out.println("Cantidad de contenedores peligrosos (contiene material peligroso y la procedencia es desconocida: " +
        puerto1.cantidadContenedoresPeligrosos());
    }
}