package com.company;

public class Jugador implements  Comparable<Jugador>{
    private int nroCamiseta;
    private String nombre;
    private boolean lesionado;
    private boolean titular;

    //No creo al jugador lesionado
    public Jugador(int nroCamiseta, String nombre, boolean titular)
    {
        this.nroCamiseta=nroCamiseta;
        this.nombre=nombre;
        this.titular=titular;
    }


    @Override
    public int compareTo(Jugador jugador) {
        if (this.nroCamiseta> jugador.nroCamiseta)
            return 1;
        if (this.nroCamiseta< jugador.nroCamiseta)
            return -1;
        return 0;
    }

    public boolean isTitular() {
        return titular;
    }

    public boolean isLesionado() {
        return lesionado;
    }

    public int getNroCamiseta() {
        return nroCamiseta;
    }

    public void setLesionado(boolean lesionado) {
        this.lesionado = lesionado;
    }

    @Override
    public String toString() {
        return "Jugador{" +
                "nroCamiseta=" + nroCamiseta +
                ", nombre='" + nombre + '\'' +
                '}';
    }
}