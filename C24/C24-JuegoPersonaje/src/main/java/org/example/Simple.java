package org.example;

public class Simple extends Habilidad {
    private double puntaje;

    @Override
    public double calcularPuntaje() {
        if(getNombre().equals("Disparar"))
            return puntaje*1.1;
        return puntaje;
    }

    @Override
    public String mostrarHabilidad() {
        return "\nHABILIDAD SIMPLE"+
                "\nNombre: "+ getNombre()+
                "\nDescripcion: "+ getDescripcion()+
                "\nPuntaje: "+ calcularPuntaje();
    }

/*
    public double getPuntaje() {
        return puntaje;
    }

 */
    public void setPuntaje(double puntaje) {
        this.puntaje = puntaje;
    }
}