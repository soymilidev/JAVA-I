package com.company;

import java.util.ArrayList;

public class Almacen {
    private String nombre;
    private ArrayList<Producto> lista;


    public Almacen(String nombre) {
        this.nombre = nombre;
        lista = new ArrayList<>();
    }

    public ArrayList<Producto> getLista() {
        return lista;
    }

    public double calcularEspacioNecesario(){
        double espacio = 0;
        for (Producto producto: lista) {
            espacio += producto.calcularEspacio();
        }
        return espacio;
    }
}