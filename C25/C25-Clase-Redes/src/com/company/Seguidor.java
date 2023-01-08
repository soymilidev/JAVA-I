package com.company;

public class Seguidor implements Observador{
    private String nombre;
    private String apellido;
    private int cantidadNotificaciones;

    public Seguidor(String nombre, String apellido) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.cantidadNotificaciones=0;
    }

    public String getNombre() {
        return nombre;
    }

    public int getCantidadNotificaciones() {
        return cantidadNotificaciones;
    }

    @Override
    public void actualizar(String nombre) {
        cantidadNotificaciones++;
        System.out.println(getNombre()+" fue notificado de la foto que subio "+ nombre);
    }

    public void mostrarCantidadNotificaciones(){
        System.out.println(getNombre() + " - Cantidad de notificaciones recibidas: " + getCantidadNotificaciones());
    }
}