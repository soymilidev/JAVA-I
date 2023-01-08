package org.example;

import java.util.ArrayList;
import java.util.List;

public class Personaje{
    private String nombre;

    private List<Habilidad> habilidades;
    public Personaje(String nombre) {
        this.nombre=nombre;
        habilidades = new ArrayList<>();
    }

    public void agregarHabilidad(Habilidad h) {

        habilidades.add(h);
    }

    public String mostrarHabilidad(){
        String informacion="";
        for(Habilidad h:habilidades) {
            informacion+=h.mostrarHabilidad();
        }
        return informacion;
    }
}