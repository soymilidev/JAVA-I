package com.company;

public class Main {
    public static void main(String[] args) {
        //Definimos una instancia de la clase Cliente. miCliente es el objeto.
        //Cliente miCliente;
        //Esta instancia para utilizarla, debemos crearla con NEW. 2 parámetros tenía el constructor,
        //enviar tres parámetros para poder crearla.
        Cliente miCliente = new Cliente(700, "James Bond");
        Cliente miCliente2 = new Cliente(110, "Maria");
        Cliente miCliente3 = new Cliente( 220,"Pedro");

        miCliente.incrementarDeuda(1000.0);

        //Opcion 1 de respuesta
        System.out.println("OPCION 1");
        System.out.println("Numero: " + miCliente.getNumeroCliente());
        System.out.println("Nombre: " + miCliente.getNombre());
        System.out.println("Deuda: " + miCliente.getSaldo());

        //Opcion 2, armar un método para no estar escribiendo uno por uno
        System.out.println("OPCION 2");
        System.out.println(miCliente.toString());
        System.out.println(miCliente2.toString());
        System.out.println(miCliente3.toString());

        //Opcion PAGA DEUDA
        miCliente.pagarDeuda();
        System.out.println("PAGA DEUDA");
        System.out.println(miCliente.toString());
    }
}
