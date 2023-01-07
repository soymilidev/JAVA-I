package com.company;

public class Cargando implements Estado{
    private Carrito carrito;

    public Cargando(Carrito carrito) {
        this.carrito = carrito;
        System.out.println("Cargando...");
    }

    @Override
    public void agregarProducto(Producto producto) {
        carrito.getListaProductos().add(producto);
    }

    @Override
    public void cancelarCarrito() {
        carrito.getListaProductos().clear();
        carrito.setEstado(new Vacio(carrito));
    }
    @Override
    public void voverAlEstadoAnterior() {
        carrito.getListaProductos().clear();
        carrito.setEstado(new Vacio(this.carrito));
    }

    @Override
    public void siguienteEstado() {
        carrito.setEstado(new Pagando(carrito));
    }
}