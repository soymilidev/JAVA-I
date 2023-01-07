package com.company;

public class Pagando implements Estado{
    private  Carrito carrito;

    public Pagando(Carrito carrito) {
        this.carrito = carrito;
        System.out.println("Pagando...");
    }

    public Carrito getCarrito() {
        return carrito;
    }

    public void setCarrito(Carrito carrito) {
        this.carrito = carrito;
    }

    @Override
    public void agregarProducto(Producto producto) {
        System.out.println("No acepta más productos. A la espera de la aceptacion de la compra");
    }

    @Override
    public void cancelarCarrito() {
        carrito.getListaProductos().clear();
        carrito.setEstado(new Vacio(carrito));
    }
    @Override
    public void voverAlEstadoAnterior() {
        carrito.setEstado(new Cargando(carrito));
    }

    @Override
    public void siguienteEstado() {
        carrito.setEstado(new Cerrado(carrito));
    }
}