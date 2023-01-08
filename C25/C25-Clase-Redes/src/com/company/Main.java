package com.company;
public class Main {
    public static void main(String[] args) {
        Usuario usuario1 = new Usuario("Guillermo", "Vilas", true);
        Usuario usuario2 = new Usuario("Rafael", "Nadal", false);
        Seguidor seguidor1 = new Seguidor("Roger", "Federer");
        Seguidor seguidor2 = new Seguidor("Novak", "Novak");
        Seguidor seguidor3 = new Seguidor("Rafael", "Nadal");
        Seguidor seguidor4 = new Seguidor("Elton", "John");

        usuario1.agregar(seguidor1);
        usuario1.agregar(seguidor2);
        usuario1.agregar(seguidor3);
        usuario1.notificar();
        seguidor1.mostrarCantidadNotificaciones();
        seguidor2.mostrarCantidadNotificaciones();
        seguidor3.mostrarCantidadNotificaciones();

        usuario2.agregar(seguidor4);
        usuario2.notificar();
        seguidor4.mostrarCantidadNotificaciones();
    }
}