package com.company;

public class Yate extends Embarcacion implements Comparable<Yate> {
    private int nroCamarotes;

    public Yate(double valorBase, double valorAdicional, int anioFabricacion, double eslora, Capitan capitan, int nroCamarotes) {
        super(valorBase, valorAdicional, anioFabricacion, eslora, capitan);
        this.nroCamarotes = nroCamarotes;
    }

    @Override
    public int compareTo(Yate o) {
        if(nroCamarotes > o.nroCamarotes)
            return 1;
        else if(nroCamarotes < o.nroCamarotes)
            return -1;
        return 0;
    }
}

    //Forma 2
    /*
    @Override
    public int compareTo(Yate o) {
        return numeroCamatores - o.numeroCamatores;
    }

    @Override
    public int compareTo(Yate o) {
        int respuesta = 0;
        if(this.numeroCamatores > o.numeroCamatores){
            respuesta = 1;
        }
        if(this.numeroCamatores < o.numeroCamatores){
            respuesta = -1;
        }
        return respuesta;
     }
     */