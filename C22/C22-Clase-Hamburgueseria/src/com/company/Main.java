package com.company;

public class Main {

    public static void main(String[] args) {
	    Carrito carrito = new Carrito(111);
        //Guardar en coleccion
        Producto producto1 = new Unidad("Hamburguesa", 1800);
        Producto producto2 = new Unidad("Papas fritas", 350);
        Producto producto3 = new Combo("Cajita feliz Mick Jagger", 0.1);
        Producto producto4 = new Unidad("Gaseosa", 350);

        ((Combo)producto3).agregarProducto(producto1);
        ((Combo)producto3).agregarProducto(producto2);

        carrito.agregarProducto(producto3);
        carrito.agregarProducto(producto4);

        System.out.println(carrito.mostrar());
        System.out.println("TOTAL CARRITO: $" + carrito.totalAPagar());
    }
}