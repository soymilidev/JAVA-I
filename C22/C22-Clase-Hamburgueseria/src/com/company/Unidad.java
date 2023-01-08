package com.company;

//extends no implement, porque resuelvo aqui no en producto
public class Unidad extends  Producto{
    private double precio;

    public Unidad(String nombre,double precio)
    {
        super(nombre);
        this.precio=precio;
    }

    @Override
    public String obtenerNombre() { return nombre; }

    @Override
    public double obtenerPrecio() {
        return precio;
    }

    @Override
    public String mostrar() {

        return "Item: " + nombre + " || Precio: $" + precio;
    }

}