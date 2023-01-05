package com.company;

public class Alumno {
    private String nombre;
    private String apellido;
    private String legajo;

    public Alumno(String nombre, String apellido, String legajo) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.legajo = legajo;
    }

    public String getNombre() {
        return nombre;
    }

    @Override
    public String toString() {
        return
                "-------------------------------------------" + '\n' +
                "ALUMNO" + '\n'+
                "Nombre: " + nombre + '\n'+
                "Apellido: " + apellido + '\n'+
                "Legajo: " + legajo + '\n' + '\n' +
                "-------------------------------------------"
                ;
    }
}