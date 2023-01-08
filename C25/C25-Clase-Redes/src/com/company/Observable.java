package com.company;
public interface Observable {
    public void agregar (Observador o);
    public void eliminar (Observador o);
    public void notificar();
}