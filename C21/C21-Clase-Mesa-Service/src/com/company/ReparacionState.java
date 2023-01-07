package com.company;

public interface ReparacionState {

    // interface para todas las funconalidades de una reparacion
    public void  valorPresupuesto (float valor) throws Exception;
    public void sumarRepuesto(float valor)throws Exception;;
    public void  cambiarDireccion(String nuevaDireccion)throws Exception;;
    public void PasarAlSiguientePaso()throws Exception;;
}