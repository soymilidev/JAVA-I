package com.company;

public class Cerrado implements Estado{
    private Carrito carrito;

    public Cerrado(Carrito carrito) {
        this.carrito = carrito;
        System.out.println("Cerrado.");
    }

    public Carrito getCarrito() {
        return carrito;
    }

    public void setCarrito(Carrito carrito) {
        this.carrito = carrito;
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
        carrito.getListaProductos().clear();
        carrito.setEstado(new Vacio(carrito));
    }
}