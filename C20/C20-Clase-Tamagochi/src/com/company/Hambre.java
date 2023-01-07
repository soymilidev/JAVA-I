package com.company;

public class Hambre implements Estado {

    Tamagochi t;

    // Constructor que inyecta la dependencia en la clase actual
    public Hambre(Tamagochi t)
    {
        this.t = t;
        System.out.println("Hambre");
    }

    @Override
    public void come()
    {
        t.setEstado(new Feliz(t));
    }

    @Override
    public void toma() {
        t.setEstado(new Triste(t));
    }

    @Override
    public void mimo() {
        //sin cambio alguno
    }

    public String toString()
    {
        return "Hambre";
    }
}