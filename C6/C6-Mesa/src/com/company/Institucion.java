package com.company;

public class Institucion {
    private String nombre;
    private String raza;
    private String fechaNacimiento;
    private double peso;
    private boolean tieneChip;
    private boolean estaHerido;
    //private boolean enAdopcion;

    public Institucion(String nombre, String raza, String fechaNacimiento, double peso, boolean tieneChip, boolean estaHerido) {
        this.nombre = nombre;
        this.raza = raza;
        this.fechaNacimiento = fechaNacimiento;
        this.peso = peso;
        this.tieneChip = tieneChip;
        this.estaHerido = estaHerido;
        posibilidadAdopcion();
    }

    public Institucion(String nombre, double peso, boolean estaHerido) {
        this.nombre = nombre;
        this.peso = peso;
        this.estaHerido = estaHerido;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public boolean isTieneChip() {
        return tieneChip;
    }

    public void setTieneChip(boolean tieneChip) {
        this.tieneChip = tieneChip;
    }

    public boolean isEstaHerido() {
        return estaHerido;
    }

    public void setEstaHerido(boolean estaHerido) {
        this.estaHerido = estaHerido;
    }


    public boolean puedePerderse() {
        return !tieneChip;
    }

    public boolean pesoMayorA5() {
        return peso > 5.0;
    }

    public boolean posibilidadAdopcion() {
        return pesoMayorA5() && !estaHerido;
    }


    @Override
    public String toString() {
        return "INSTITUCION" + "\n" +
                "Nombre: " + nombre + "\n" +
                "Raza: " + raza + "\n" +
                "Fecha de Nacimiento: " + fechaNacimiento + "\n" +
                "Peso: " + peso + "\n" +
                "Chip: " + tieneChip + "\n" +
                "Herido: " + estaHerido + "\n" +
                "Posibilidad de Perderse: " + puedePerderse() + "\n" +
                "Posibilidad de Adopcion: " + posibilidadAdopcion() + "\n" +
                "--------------------------------------------------------------"
                ;
    }
}