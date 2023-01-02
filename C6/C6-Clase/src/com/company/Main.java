package com.company;

public class Main {
    public static void main(String[] args) {
        //Pasar los parametros. Abrir comillas para autocompletar.
        Impresora miImpresora = new Impresora("HP", "USB", "2021");
        miImpresora.agregarHojas(100); //recien la compro, le agrego hojas
        miImpresora.imprimir("Hola");
        System.out.println(miImpresora.toString());
    }
}