package com.company;

import java.util.ArrayList;
import java.util.Locale;

public class Seleccion {

    private String nombre;
    private ArrayList<Jugador> jugadores;
    public Seleccion(String nombre){
        this.nombre = nombre;
        this.jugadores = new ArrayList<>();
    }
    public void agregarJugador(Jugador jugador)
    {
        jugadores.add(jugador);
    }

    public ArrayList<Jugador> obtenerReservas()
    {
        ArrayList<Jugador> reservas = new ArrayList<>();
        //Recorrer el array al reves. Los últimos 5.
        //for(int i= jugadores.size() -1; i >= jugadores.size() - 5 ; i--)
        for(int i= jugadores.size() -5; i <= jugadores.size() -1 ; i++)
            reservas.add(jugadores.get(i));
        //Agrego los jugadores de la posicion actual
        return reservas;
    }

    public int cantJugadores(String posicion) throws Exception {
        int cont = 0;
        posicion = posicion.toUpperCase(Locale.ROOT);
        if (posicion == "ARQUERO" || posicion == "MEDIOCAMPISTA" ||
                posicion == "DELANTERO" || posicion == "DEFENSOR") {

            for(Jugador jugador: jugadores) {
                if(jugador.getPosicion() == posicion)
                    cont++;
            }

        }else{
            //Se dispara una excepción si la posición es inválida
            throw new Exception("La posición " + posicion + " es inválida.");
        }

        return cont;
    }
}