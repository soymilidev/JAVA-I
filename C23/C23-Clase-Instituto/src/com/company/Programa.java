package com.company;

import java.util.ArrayList;
import java.util.List;

public class Programa extends OfertaAcademica{
    private double porcentajeBonificacion;
    private List<OfertaAcademica> ofertas = new ArrayList<>();


    @Override
    public String mostrarDatos() {

        return "Nombre: " + getNombre() + "Precio: " + calcularPrecio();
    }

    @Override
    public double calcularPrecio() {
        double total=0;
        for(OfertaAcademica o:ofertas)
            total+=o.calcularPrecio();
        total-= total/100*porcentajeBonificacion;
        return total;
    }
    public void agregarOferta(OfertaAcademica oferta)
    {
        ofertas.add(oferta);
    }

    public double getPorcentajeBonificacion() {
        return porcentajeBonificacion;
    }

    public void setPorcentajeBonificacion(double porcentajeBonificacion) {
        this.porcentajeBonificacion = porcentajeBonificacion;
    }
}