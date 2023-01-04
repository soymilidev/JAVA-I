package com.company;

public class Main {

    public static void main(String[] args) {
        Socio socio1 = new Socio("1234", "Juan","Basketball",5000.0 );
        Socio socio2 = new Socio("5678", "Juana","Volleyball",5000.0 );
        SocioHabilitado socioPileta = new SocioHabilitado("9101", "Azul", "Natacion",5000.0,1500.00, true);

        System.out.println(socio1.toString());
        System.out.println(socio2.toString());
        System.out.println(socioPileta.toString());

        System.out.println("Cuota socio con pileta " + socioPileta.calcularCostoMensual());
        System.out.println("Cuota socio comun " + socio1.calcularCostoMensual());
        if (socio1.equals(socio2))
            System.out.println("Son el mismo socio");
        else
            System.out.println("No es el mismo socio");
    }
}