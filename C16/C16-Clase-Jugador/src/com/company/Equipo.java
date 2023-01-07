package com.company;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Equipo {
    private String nombre;
    //Tipo <Jugador>
    private List<Jugador> jugadores;
    //List es una interfaz, no se instancia.
    //Lo que se instancia es todooo lo que se deriva, por ejemplo ArrayList, LinkedList.

    public Equipo(String nombre)
    {
        this.nombre=nombre;
        jugadores= new ArrayList<>();
    }

    //(Jugador nuevo) = (jugador j)
    //Recibo un objeto jugador para agregarlo a mi equipo
    public void addJugador(Jugador nuevo)
    {
        //tomo la colecciones jugadores y agrego al jugador
        jugadores.add(nuevo);
    }
    public void mostrarJugadoresTitulares()
    {
        ordenarJugadores();
        for(int i=0;i<jugadores.size();i++)
        {
            //Sin esta linea: private List<Jugador> jugadores... Tendria que realizar CASTEO.
            //Sin <Jugador>, piensa que es un objeto, porque no le defini que estoy almacenando.
            if (jugadores.get(i).isTitular())
                System.out.println(jugadores.get(i).toString());
        }
    }
    public int cantidadJugadoresLesionados()
    {   int cantidad=0;
        //Para todoo jugador que esta en jugadores, en cada iteracion le voy a preguntar (if)
        for (Jugador j:jugadores)
        {
            //Por defecto toma que es true, no hace falta: if(j.isLesionado()==true)
            if(j.isLesionado())
                cantidad++;
        }
        return cantidad;
    }

    /*
    //OTRA FORMA
    //(Iterable<Jugador>) jugadores.iterator(): Iterador lo tomo de array list
    public void jugadorLesionado(int nroCamiseta)
    {
        Iterable<Jugador> iterador = (Iterable<Jugador>) jugadores.iterator();
        while (iterador.iterator().hasNext())
        {

        }
    }
*/
    public void jugadorLesionado(int nroCamiseta)
    {
        for( int i=0;i<jugadores.size();i++)
        {
            if (nroCamiseta==jugadores.get(i).getNroCamiseta())
                jugadores.get(i).setLesionado(true);
        }
    }
    private void ordenarJugadores()
    {
        for (int i=0; i<jugadores.size(); i++)
            //-1 porque sino me paso de tamaño
            for(int j=0; j<jugadores.size()-1;j++)
                //no se puede usar >, utilizo compareTo
                if(jugadores.get(j).compareTo(jugadores.get(j+1))==1)
                {
                    Jugador aux=jugadores.get(j+1);
                    //La posicion: j+1 ---- Qué: jugadores.get(j) / En la posicion tal, pone tal cosa.
                    jugadores.set(j+1,jugadores.get(j));
                    //jugadores.get(j+1)= jugadores.get(j);
                    //jugadores.get(j)=aux;
                    jugadores.set(j,aux);
                }
    }
}