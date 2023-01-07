package com.company;

public class Feliz implements Estado {

    //Para cambiar el estado de Tamagochi inicial (original)
    private Tamagochi t;

    // Constructor que inyecta la dependencia en la clase actual
    public Feliz(Tamagochi t)
    {
        this.t = t;
        System.out.println("Feliz");
    }

    @Override
    public void come() {
        t.setEstado(new Sed(t));
    }

    @Override
    public void toma() {
        t.setEstado(new Hambre(t));
    }

    @Override
    public void mimo() {
        //sin cambio alguno
    }

    public String toString()
    {
        return "Feliz";
    }
}