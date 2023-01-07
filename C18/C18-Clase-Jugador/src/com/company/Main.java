package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        //Creacion de la selección argentina 2022
        Seleccion seleccion = new Seleccion("ARGENTINA");
        seleccion.agregarJugador(new Jugador("Franco Armani",1, "ARQUERO"));
        seleccion.agregarJugador(new Jugador("Juan Foyth",2, "DEFENSOR"));
        seleccion.agregarJugador(new Jugador("Nicolás Tagliafico",3, "DEFENSOR"));
        seleccion.agregarJugador(new Jugador("Gonzalo Montiel",4, "DEFENSOR"));
        seleccion.agregarJugador(new Jugador("Leandro Paredes",5, "MEDIOCAMPISTA"));
        seleccion.agregarJugador(new Jugador("Germán Pezzella",6, "DEFENSOR"));
        seleccion.agregarJugador(new Jugador("Rodrigo De Paul",7, "MEDIOCAMPISTA"));
        seleccion.agregarJugador(new Jugador("Marcos Acuña",8, "DEFENSOR"));
        seleccion.agregarJugador(new Jugador("Julián Álvarez",9, "DELANTERO"));
        seleccion.agregarJugador(new Jugador("Lionel Messi",10, "DELANTERO"));
        seleccion.agregarJugador(new Jugador("Ángel Di María",11, "DELANTERO"));
        seleccion.agregarJugador(new Jugador("Gerónimo Rulli",12, "ARQUERO"));
        seleccion.agregarJugador(new Jugador("Cristian Romero",13, "DEFENSOR"));
        seleccion.agregarJugador(new Jugador("Exequiel Palacios",14, "MEDIOCAMPISTA"));
        seleccion.agregarJugador(new Jugador("Nicolás González",15, "DELANTERO"));
        seleccion.agregarJugador(new Jugador("Joaquín Correa",16, "DELANTERO"));
        seleccion.agregarJugador(new Jugador("Alejandro Gómez",17, "MEDIOCAMPISTA"));
        seleccion.agregarJugador(new Jugador("Guido Rodríguez",18, "MEDIOCAMPISTA"));
        seleccion.agregarJugador(new Jugador("Nicolás Otamendi",19, "DEFENSOR"));
        seleccion.agregarJugador(new Jugador("Alexis Mac Allister",20, "MEDIOCAMPISTA"));
        seleccion.agregarJugador(new Jugador("Paulo Dybala",21, "DELANTERO"));
        seleccion.agregarJugador(new Jugador("Lautaro Martínez",22, "DELANTERO"));
        seleccion.agregarJugador(new Jugador("Emiliano Martínez",23, "ARQUERO"));
        /*
        seleccion.agregarJugador(new Jugador("Enzo Fernández",24, "MEDIOCAMPISTA"));
        seleccion.agregarJugador(new Jugador("Lisandro Martínez",25, "DEFENSOR"));
        seleccion.agregarJugador(new Jugador("Nahuel Molina",26, "DEFENSOR"));
        */

        //Los jugadores de reserva de la selección ---> método obtenerReservas()
        ArrayList<Jugador> jugadoresReserva = seleccion.obtenerReservas();
        System.out.println("Jugadores de reserva");
        for(Jugador jugador : jugadoresReserva)
            System.out.println(jugador.getNombre_y_apellido());

        //Método cantJugadores() y atrapar excepción
        try {
            System.out.println("Cantidad de Defensores: " + seleccion.cantJugadores("DEFENSOR"));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}