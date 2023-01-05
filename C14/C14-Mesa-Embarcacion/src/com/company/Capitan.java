package com.company;

public class Capitan {
    private String nombre;
    private String apellido;
    private String matriculaNavegacion;

    public Capitan(String nombre, String apellido, String matriculaNavegacion) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.matriculaNavegacion = matriculaNavegacion;
    }

    @Override
    public String toString() {
        return "CAPITAN" + '\n' +
                "Nombre: " + nombre + '\n' +
                "Apellido: " + apellido + '\n' +
                "Matricula de Navegacion: " + matriculaNavegacion + '\n' +
                "---------------------------------------------------------"
                ;
    }
}