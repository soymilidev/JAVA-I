package com.company;

public class Contenedor implements Comparable <Contenedor> {
    private int id;
    private String paisOrigen;
    private boolean materialPeligroso;

    public Contenedor(int id, String paisDeOrigen, boolean esPeligroso) {
        this.id = id;
        this.paisOrigen = paisDeOrigen;
        this.materialPeligroso = esPeligroso;
    }

    public int getId() {
        return id;
    }
    public String getPaisOrigen() {
        return paisOrigen;
    }

    public Comparable<Boolean> getMaterialPeligroso() {
        return materialPeligroso;
    }

    //Comparar ID
    //Evaluar cuál es mayor, menor o igual a otro.
    @Override
    public int compareTo(Contenedor o) {
        if (id>o.id){
            return 1;
        } else if (id<o.id) {
            return -1;
        }else {
            return 0;
        }
    }

    @Override
    public String toString() {
        return "CONTENEDOR" + '\n' +
                "Id: " + id + '\n' +
                "Pais de origen: " + paisOrigen + '\n' +
                "Material peligroso: " + materialPeligroso + '\n' +
                "--------------------------------------"
                ;
    }
}