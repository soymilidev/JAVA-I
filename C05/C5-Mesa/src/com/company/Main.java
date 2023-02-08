package com.company;

public class Main {
    public static void main(String[] args) {
        UsuarioJuego usuario=new UsuarioJuego("Juan Volkswagen","ABC123");
        System.out.println("Usuario: " + usuario.getNombre() + " - Nivel: " + usuario.getNivel() + " - Puntaje: " + usuario.getPuntaje());

        usuario.subirNivel();
        usuario.aumentarPuntaje();
        usuario.aumentarPuntaje();
        System.out.println("Usuario: " + usuario.getNombre() + " - Nivel: " + usuario.getNivel() + " - Puntaje: " + usuario.getPuntaje());

        usuario.bonus(100);
        System.out.println("Usuario: " + usuario.getNombre() + " - Nivel: " + usuario.getNivel() + " - Puntaje: " + usuario.getPuntaje());
    }
}