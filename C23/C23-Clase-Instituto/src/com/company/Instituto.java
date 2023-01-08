package com.company;

import java.util.ArrayList;
import java.util.List;

public class Instituto {
    private String nombre;
    private List<OfertaAcademica> ofertas;

    public Instituto(String nombre)
    {
        this.nombre= nombre;
        ofertas = new ArrayList<>();
    }
    public void generarInforme()
    {
        for (OfertaAcademica oferta : ofertas)
            System.out.println(oferta.mostrarDatos());
    }
    public void agregarOfertaAcademica(OfertaAcademica oferta)
    {
        ofertas.add(oferta);
    }
}