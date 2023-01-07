package com.company;

public class EmpleadoPorHora extends Empleado{

    private Double importePorHora;
    private Integer horasTrabajadas;

    //Utilizo este constructor en el Main, sumo el código
    public EmpleadoPorHora() {
        super("", "", 0);
        importePorHora = 10.0;
        horasTrabajadas = 10;
    }

    public EmpleadoPorHora(String nombre, String apellido, Integer legajo, Double importePorHora) {
        super(nombre, apellido, legajo);
        this.importePorHora = importePorHora;
        horasTrabajadas = 0;
    }

    @Override
    public Double calcularSueldo() {

        return importePorHora * horasTrabajadas;
    }

    public void cargarHoras(Integer horasIngresadas){
        horasTrabajadas += horasIngresadas;
    }
}