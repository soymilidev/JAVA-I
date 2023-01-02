package com.company;

public class Main {
    public static void main(String[] args) {

        //Create a perro1
        Perro perro1 = new Perro("Thor", "Schnauzer", 2009, 2022, 9.5, true, false, true);
        perro1.mensajeAdopcion();
        perro1.mensajePerderse();
        perro1.mensajeEdad();
        System.out.println(perro1.toString());

        Perro perro2 = new Perro("Pacha", "Schnauzer", 2009, 2022, 5.0, false, false, true);
        perro2.mensajeAdopcion();
        perro2.mensajePerderse();
        perro2.mensajeEdad();
        System.out.println(perro2.toString());

/*
        System.out.println("DATOS");
        System.out.println(
                "nombre: " + perro1.getNombre() + "\n" +
                "raza: " + perro1.getRaza() + "\n" +
                "anioNacimiento: " + perro1.getAnioNacimiento() + "\n" +
                "peso (kg): " + perro1.getPeso() + "\n" +
                "tieneChip: " + perro1.isTieneChip() + "\n" +
                "estaHerido: " + perro1.isEstaHerido() + "\n" +
                "adopcion: " + perro1.isAdopcion() + "\n\n");
                */
    }
}