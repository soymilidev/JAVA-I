package com.company;

import java.util.ArrayList;
import java.util.List;

public class Combo extends  Producto{
    private double descuento;
    private List<Producto> listaProductos;

    public Combo(String nombre, double descuento) {
        super(nombre);
        this.descuento = descuento;
        listaProductos = new ArrayList<>();
    }

    public void agregarProducto(Producto producto)
    {

        listaProductos.add(producto);
    }

    @Override
    public String obtenerNombre() {
        return nombre;
    }

    @Override
    public double obtenerPrecio() {
        double total = 0;
        for(Producto p: listaProductos)
            total += p.obtenerPrecio();
        total = total - total/100*descuento; //total = total*(1-descuento);
        return total;
    }

    @Override
    public String mostrar() {
        String texto = "";
        for (Producto p: listaProductos)
            texto += p.mostrar() + "\n";
        texto += "-- Precio total de " + obtenerNombre() + ": $" + obtenerPrecio() + " --" + "\n";
        return texto;
    }

}