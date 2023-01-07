package com.company;

public interface Estado {
    void agregarProducto(Producto producto);
    void cancelarCarrito();
    void voverAlEstadoAnterior();
    void siguienteEstado();
}