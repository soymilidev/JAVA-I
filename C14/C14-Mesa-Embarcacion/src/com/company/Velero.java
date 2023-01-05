package com.company;

public class Velero extends Embarcacion {
    private int nroMastiles;


    public Velero(double valorBase, double valorAdicional, int anioFabricacion, double eslora, Capitan capitan, int nroMastiles) {
        super(valorBase, valorAdicional, anioFabricacion, eslora, capitan);
        this.nroMastiles = nroMastiles;
    }

    public int getNroMastiles() {
        return nroMastiles;
    }

    public boolean esGrande(){
        return (
                getNroMastiles() > 4);
    }

    @Override
    public String toString() {
        return "Velero{" +
                "nroMastiles=" + nroMastiles +
                '}';
    }
}