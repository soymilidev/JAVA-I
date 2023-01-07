package com.company;

public class Main {

    public static void main(String[] args) {

        //Creamos un objeto del tipo Empresa
        Empresa empresa = new Empresa();

        //Creamos dos reservas
        Reserva reserva1 = new Reserva();
        reserva1.setCodigo("BS2220");
        reserva1.setCantidadViajeros(2);
        reserva1.setEstacionOrigen("BUENOS AIRES");
        reserva1.setEstacionDestino("MERCEDES");

        Reserva reserva2 = new Reserva();
        reserva2.setCodigo("BS2320");
        reserva2.setCantidadViajeros(3);
        reserva2.setEstacionOrigen("BUENOS AIRES");
        reserva2.setEstacionDestino("BRAGADO");

        //Agregamos las reservas a la empresa
        empresa.agregarReserva(reserva1);
        empresa.agregarReserva(reserva2);

        //Invocación de los dos métodos solicitados
        System.out.println("Recaudacion total: $" + empresa.recaudacionTotal());
        System.out.println("Cantidad de veces que pasaron por : BUENOS AIRES: " + empresa.cantidadVecesRecorrida("BUENOS AIRES"));
    }
}