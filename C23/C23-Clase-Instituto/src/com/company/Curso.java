package com.company;

public class Curso extends OfertaAcademica{

    private int cargaHorariaMensual;
    private double valorHora;
    private int duracionMeses;


    @Override
    public String mostrarDatos() {
        return "Nombre: " + getNombre() + "Precio:" +calcularPrecio();
    }

    @Override
    public double calcularPrecio() {
        return cargaHorariaMensual*duracionMeses*valorHora;
    }

    public int getCargaHorariaMensual() {
        return cargaHorariaMensual;
    }

    public void setCargaHorariaMensual(int cargaHorariaMensual) {
        this.cargaHorariaMensual = cargaHorariaMensual;
    }

    public double getValorHora() {
        return valorHora;
    }

    public void setValorHora(double valorHora) {
        this.valorHora = valorHora;
    }

    public int getDuracionMeses() {
        return duracionMeses;
    }

    public void setDuracionMeses(int duracionMeses) {
        this.duracionMeses = duracionMeses;
    }
}