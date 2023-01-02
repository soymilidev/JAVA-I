package com.company;

public class Main {
    public static void main(String[] args) {
        Institucion consulta1 = new Institucion("AlfaRomeo", "-----", "01-01-2018", 7, true, false);
        System.out.println(consulta1.toString());

        Institucion consulta2 = new Institucion("Alfa", "-----", "01-01-2021", 10, false, false);
        System.out.println(consulta2.toString());

        Institucion consulta3 = new Institucion("Romeo", "-----", "01-01-2022", 4, true, true);
        System.out.println(consulta3.toString());
    }
}