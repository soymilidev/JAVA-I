package com.company;

import java.util.ArrayList;

public class Carrito {
    private Estado estado;
    private ArrayList<Producto> listaProductos;

    public Carrito() {
        this.estado = new Vacio(this);
        listaProductos = new ArrayList<>();
    }

    public Estado getEstado() {
        return estado;
    }
    public void setEstado(Estado estado) {
        this.estado = estado;
    }
    public ArrayList<Producto> getListaProductos(){
        return listaProductos;
    }

    public void setListaProductos(ArrayList<Producto> listaProductos){
        this.listaProductos = listaProductos;
    }

    public void agregarProducto(Producto producto){
        getEstado().agregarProducto(producto);
    }

    public void cancelarCarrito(){
        getEstado().cancelarCarrito();
    }

    public void volverAlEstadoAnterior(){
        getEstado().voverAlEstadoAnterior();
    }
    public void siguienteEstado(){
        getEstado().siguienteEstado();
    }

    public void mostrarProductos(){
        for (Producto producto : listaProductos) {
            System.out.println(producto.getDescripcion() + ": $" + producto.getPrecio());
        }
    }

    /*
    Los métodos que cambian el estado del carrito, no tienen código implementado en la clase Carrito.
    Delega la responsabilidad de implementar estos métodos a la clase Estado y sus clases hijas (implementación del patrón State).
    Permite a un objeto cambiar su *comportamiento* dinámicamente al cambiar su estado interno.
    El carrito puede tener diferentes comportamientos *dependiendo del estado* en el que se encuentre (por ejemplo, vacío).
     */
}