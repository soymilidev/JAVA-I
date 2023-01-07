package com.company;

public class Vacio implements Estado{
    private Carrito carrito;

    public Vacio(Carrito carrito) {
        this.carrito = carrito;
        System.out.println("Carrito vacio...");
    }

    @Override
    public void agregarProducto(Producto producto) {
    }
    @Override
    public void cancelarCarrito() {
    }
    @Override
    public void voverAlEstadoAnterior() {
    }
    @Override
    public void siguienteEstado() {
        carrito.setEstado(new Cargando(carrito));
    }
}