package com.company;

public class Parcial extends  Examen{
    private int nroUnidad;
    private int nroIntentos;

    public Parcial(String titulo, String enunciado, double nota, Alumno alumno, int nroUnidad, int nroIntentos) {
        super(titulo, enunciado, nota, alumno);
        this.nroUnidad = nroUnidad;
        this.nroIntentos = nroIntentos;
    }

    @Override
    public boolean estaAprobado() {

        return (getNota() >= 4);
    }

    public boolean puedoRecuperar(){
        if ((nroUnidad <= 3 && nroIntentos < 3)||(nroUnidad > 3 && nroIntentos < 2)) {
            nroIntentos++;
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return "PARCIAL" + '\n' +
                "Numero de Unidad: " + nroUnidad + '\n' +
                "Numero de intentos: " + nroIntentos + '\n' +
                "-------------------------------------------";
    }
}
