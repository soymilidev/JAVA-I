package com.company;

public abstract class Embarcacion {
    private Double valorBase;
    private Double valorAdicional;
    private int anioFabricacion;
    private Double eslora;
    //eslora --> longitud en metros
    private Capitan capitan;

    public Embarcacion(double valorBase, double valorAdicional, int anioFabricacion, double eslora, Capitan capitan) {
        this.valorBase = valorBase;
        this.valorAdicional = valorAdicional;
        this.anioFabricacion = anioFabricacion;
        this.eslora = eslora;
        this.capitan = capitan;
    }

    public Capitan getCapitan() {
        return capitan;
    }

    public Double calcularAlquiler(){
        if(anioFabricacion > 2020){
            valorBase += valorAdicional;
        }
        return valorBase;
    }

    @Override
    public String toString() {
        return "EMBARCACION" + '\n' +
                "Valor base: " + valorBase + '\n' +
                "Valor adicional: " + valorAdicional + '\n' +
                "Año de Fabricacion: " + anioFabricacion + '\n' +
                "Eslora: " + eslora + '\n' +
                capitan + '\n'
                ;
    }
}
