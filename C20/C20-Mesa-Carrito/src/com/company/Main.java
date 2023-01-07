package com.company;

public class Main {
    public static void main(String[] args) {
        Carrito carrito = new Carrito();
        Producto comestible1 = new Producto("Manzanas",449);
        Producto comestible2 = new Producto("Pan en rebanadas",860);
        Producto comestible3 = new Producto("Jugo de Manzana",793);

        carrito.mostrarProductos();
        carrito.siguienteEstado();
        carrito.agregarProducto(comestible1);
        carrito.agregarProducto(comestible2);
        carrito.agregarProducto(comestible3);
        //carrito.volverAlEstadoAnterior();
        carrito.mostrarProductos();
        carrito.cancelarCarrito();
        carrito.siguienteEstado();
        carrito.agregarProducto(comestible1);
        carrito.agregarProducto(comestible2);
        carrito.agregarProducto(comestible3);
        carrito.mostrarProductos();
        carrito.siguienteEstado();
        carrito.siguienteEstado();
    }
}