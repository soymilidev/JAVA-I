package com.company;
import java.util.ArrayList;

public class Usuario implements Observable {
    private String nombre;
    private String apellido;
    private boolean fotoPublicada;
    private ArrayList<Observador> seguidores;

    public Usuario(String nombre, String apellido, boolean fotoPublicada) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.fotoPublicada = fotoPublicada;
        seguidores = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setFotoPublicada(boolean fotoPublicada) {
        this.fotoPublicada = fotoPublicada;
    }


    @Override
    public void agregar(Observador o) {

        seguidores.add(o);
    }

    @Override
    public void eliminar(Observador o) {

        seguidores.remove(o);
    }

    @Override
    public void notificar() {
        if (fotoPublicada) {
            for (Observador o : seguidores) {
                o.actualizar(getNombre());
            }
        } else {
            System.out.println("Error - No hay nuevas notificaciones, el usuario no ha realizado nuevas publicaciones");
        }
        }
    }