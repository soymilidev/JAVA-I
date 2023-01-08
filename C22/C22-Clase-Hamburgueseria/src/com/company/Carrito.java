package com.company;

import java.util.ArrayList;
import java.util.List;

public class Carrito {
    private int numeroPedido;
    private List<Producto> productos;

    public Carrito(int numeroPedido)
    {
        this.numeroPedido = numeroPedido;
        productos = new ArrayList<>();
    }
    public void agregarProducto(Producto producto)
    {

        productos.add(producto);
    }

    public double totalAPagar()
    {
        double total = 0;
        for(Producto p:productos)
            total += p.obtenerPrecio();
        return total;
    }

    public String mostrar()
    {
        String aux = "";
        for (Producto p:productos)
            aux += p.mostrar() + "\n";
        return aux;

    }

}