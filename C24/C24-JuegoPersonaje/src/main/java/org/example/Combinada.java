package org.example;

import java.util.ArrayList;
import java.util.List;

public class Combinada extends Habilidad {
    private int factorMultiplicador;

    private List<Habilidad> simples;          /*List<Habilidad> habilidades*/
    public Combinada() {
        this.simples = new ArrayList<>();     /*this.habilidades*/
    }

    @Override
    public double calcularPuntaje() {
        double total=0;
        for(Habilidad h:simples)
            total += h.calcularPuntaje();
        return total*factorMultiplicador;
    }

    @Override
    public String mostrarHabilidad() {
        return "\nHABILIDAD COMBINADA"+
                "\nNombre: "+ getNombre()+
                "\nDescripcion: "+ getDescripcion()+
                "\nPuntaje: "+ calcularPuntaje();
    }

    /*
    public int getFactorMultiplicador() {
        return factorMultiplicador;
    }
    */
    public void setFactorMultiplicador(int factorMultiplicador) {
        this.factorMultiplicador = factorMultiplicador;
    }

    public void agregarSimple(Habilidad s){
        simples.add(s);
    }
}