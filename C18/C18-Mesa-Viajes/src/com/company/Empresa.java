package com.company;

import java.util.ArrayList;
public class Empresa {
    private ArrayList<Reserva> reservas;
    public Empresa(){
        reservas = new ArrayList<>();
    }

    //Incorporar reservas a la colección reservas
    public void agregarReserva(Reserva reserva){
        reservas.add(reserva);
    }
    public double recaudacionTotal(){
        double total = 0;
        for(Reserva reserva : reservas){
            total += reserva.calcularPrecioReserva();
        }

        return total;
    }

    public int cantidadVecesRecorrida(String estacion){
        int cant = 0;
        for(Reserva reserva : reservas)
        {
            if(reserva.getEstacionDestino() == estacion ||
                    reserva.getEstacionOrigen() == estacion){

                cant++;
            }
        }
        return cant;
    }
}