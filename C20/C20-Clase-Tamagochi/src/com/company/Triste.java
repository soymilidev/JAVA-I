package com.company;

public class Triste implements Estado {

    Tamagochi t;

    // Constructor que inyecta la dependencia en la clase actual
    public Triste(Tamagochi t)
    {
        this.t = t;
        System.out.println("Triste");
    }

    @Override
    public void come() {
        System.out.println("Beep Beep... Mascota vomitando");
    }

    @Override
    public void toma() {
        System.out.println("Beep Beep Beep");
    }

    @Override
    public void mimo() {
        t.setEstado(new Feliz(t));
    }

    public String toString()
    {
        return "Triste";
    }
}