package com.company;

public class Cliente {
    private int numeroCliente;
    private String nombre;
    private String apellido;
    private long dni;
    private long cuit;

    public Cliente(int numeroCliente, String nombre, String apellido, long dni, long cuit) {
        this.numeroCliente = numeroCliente;
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.cuit = cuit;
    }

    public int getNumeroCliente() {
        return numeroCliente;
    }

    public String getNombre() {

        return nombre;
    }

    public String getApellido() {

        return apellido;
    }

    public long getDni() {

        return dni;
    }

    public long getCuit() {

        return cuit;
    }

    @Override
    public String toString() {
        return "CLIENTE " + "\n" +
                "Numero de Cliente: " + numeroCliente + "\n" +
                "Nombre: " + nombre + "\n" +
                "Apellido: " + apellido + "\n" +
                "D.N.I.: " + dni + "\n" +
                "C.U.I.T.: " + cuit + "\n"
                ;
    }
}