package com.company;

import java.util.ArrayList;
import java.util.List;

public class Empresa {

    private String razonSocial;
    private List<Empleado> lista;

    public Empresa(String razonSocial) {
        this.razonSocial = razonSocial;
        lista = new ArrayList<>();
    }

    public void agregarEmpleado(Empleado empleado){
        lista.add(empleado);
    }

    public Double calcularSueldosTotales(){
        Double sueldosTotales = 0.0;
        for(Empleado empleado : lista){
            sueldosTotales += empleado.calcularSueldo();
        }
        return sueldosTotales;
    }

    public Empleado verEmpleado(int pos)
    {
        return lista.get(pos);
    }
}