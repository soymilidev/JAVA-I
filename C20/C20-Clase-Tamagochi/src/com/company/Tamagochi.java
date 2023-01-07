package com.company;

public class Tamagochi {
    //Una variable de tipo "Estado" llamada "estado", que representa el estado actual del Tamagochi.
    private Estado estado;
    private String nombre;

    public Tamagochi(String nombre) {
        this.nombre = nombre;
        this.setEstado(new Triste(this));
        //Establece el estado inicial del Tamagochi como "triste"
        //Segun lo que haga va a ir cambiando el estado
    }

    public void come()
    {
        getEstado().come();
    }

    public void toma()
    {
        getEstado().toma();
    }

    public void mimo()
    {
        getEstado().mimo();
    }

    public Estado getEstado()
    {
        return estado;
    }

    public void setEstado(Estado estado)
    {
        this.estado = estado;
    }

    /*
    La clase "Tamagochi" tiene tres métodos: "come()", "toma()" y "mimo()". Cada uno de estos métodos llama al método
    del mismo nombre en el objeto "estado" actual del Tamagochi. Esto significa que el comportamiento del Tamagochi
    dependerá del estado en el que se encuentre en un momento dado.
     */
}