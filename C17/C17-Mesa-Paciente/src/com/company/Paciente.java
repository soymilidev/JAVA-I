package com.company;

import java.time.LocalDate;

public class Paciente {
    String nombre;
    String apellido;
    String historiaClinica;
    LocalDate fechaInternacion;
    LocalDate fechaAlta;

    public Paciente(String nombre, String apellido, String historiaClinica, LocalDate fechaInternacion) throws PacienteException {
        LocalDate hoy = LocalDate.now();
        if (fechaInternacion.isAfter(hoy)) {
            throw new PacienteException("Fecha de internacion posterior al dia de hoy.");
        }
        this.fechaInternacion = fechaInternacion;
        this.nombre = nombre;
        this.apellido = apellido;
        this.historiaClinica = historiaClinica;
        fechaAlta = null;
        //Solo se imprime si se ha pasado todas las comprobaciones
        System.out.println("Fecha de internacion registrada exitosamente.");
    }

    public LocalDate getFechaInternacion() {
        return fechaInternacion;
    }

    public LocalDate getFechaAlta() {
        return fechaAlta;
    }

    public void darAlta(LocalDate fechaAlta) throws PacienteException {
        //Negación (!) para invertir la condición del if, solo se lanza la excepción si la fecha de alta no es posterior
        if (!fechaAlta.isAfter(fechaInternacion)) {
            throw new PacienteException("La fecha de alta debe ser posterior a la fecha de internacion.");
        }
        //Asignación de la fecha de alta al final, solo se realiza si se ha pasado todas las comprobaciones
        this.fechaAlta = fechaAlta;
        System.out.println("Fecha de alta registrada exitosamente.");
    }


    @Override
    public String toString() {
        return  "---------------------------------------------------" + "\n" +
                "PACIENTE" + "\n" +
                "Nombre: " + nombre + "\n" +
                "Apellido: " + apellido + "\n" +
                "Historia Clinica: " + historiaClinica + "\n" +
                "Fecha de Internacion: " + fechaInternacion + "\n" +
                "Fecha de Alta: " + fechaAlta + "\n" +
                "---------------------------------------------------"
                ;
    }
}