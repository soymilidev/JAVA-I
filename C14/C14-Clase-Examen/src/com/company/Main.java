package com.company;

public class Main {

    public static void main(String[] args) {
        Alumno alumno1 = new Alumno("Juana", "Molina", "120055");
        Alumno alumno2 = new Alumno("Bruce", "Lee", "120099");
        Examen final1 = new Final("POO I", "Consigna...", 9.0, alumno1, 8.00, "Tema...");
        Examen final2 = new Final("Kung fu", "Consigna...", 10.0, alumno2, 10.00, "Tema...");
        Examen parcial1 = new Parcial("POO II", "Consigna...", 9.0, alumno1, 3, 4);

        System.out.println(alumno1.toString());

        System.out.println(final1.toString());
        System.out.println(final1.getNota());
        System.out.println(parcial1.toString());

        System.out.println("Examen final esta aprobado: " + final1.estaAprobado());
        System.out.println("Examen parcial esta aprobado: " + parcial1.estaAprobado());
        System.out.println("Examen parcial puede recuperar: " + ((Parcial) parcial1).puedoRecuperar());
        System.out.println("-------------------------------------------");

        //Por la manera de instancia Examen, es preciso realizar un CASTEO
        if (((Final) final1).compareTo((Final) final2)==1)
            System.out.println("A " + alumno1.getNombre() + " le fue mejor en POO I, la calificacion es mayor" + '\n');
        else if(((Final) final1).compareTo((Final) final2)==-1)
            System.out.println("A " + alumno2.getNombre() + " le fue mejor en Kung fu, la calificacion es mayor" + '\n');
        else
            System.out.println("La calificacion de " + alumno1.getNombre() + " y " + alumno2.getNombre() + " son iguales" + '\n');
        System.out.println("-------------------------------------------");


        //***NOTAS***//
        /*
        OTRA FORMA DE INSTANCIAR, cuando preciso aplicar poliformismo.
        Le voy a pedir que haga algo, que el examen final va a ser de una forma y el parcial de otra.
        Como no voy a saber si voy a tener un final o parcial, lo resuelve c/ uno de una forma.
        Examen final1 = new Final("POO I", "Consigna...", 9.0, alumno1, 8.00, "Tema...");
        
        //OTRA FORMA
        Final final1 = new Final("POO I", "Consigna...", 9.0, alumno1, 8.00, "Tema...");
        */

        /*
        //SIN CASTEO
        if (final1.compareTo(final2)==1)
            System.out.println("A " + alumno1.getNombre() + " le fue mejor en POO I, la calificacion es mayor" + '\n');
        else if(final1.compareTo(final2)==-1)
            System.out.println("A " + alumno2.getNombre() + " le fue mejor en Kung fu, la calificacion es mayor" + '\n');
        else
            System.out.println("La calificacion de " + alumno1.getNombre() + " y " + alumno2.getNombre() + " son iguales" + '\n');
        }
         */

        /*
        // Verificando si el examen esta aprobado:
        if(parcial1.estaAprobado())
            System.out.println("PARCIAL 1: Esta aprobado");
        else
            System.out.println("PARCIAL 1: No esta aprobado");

        if(final1.estaAprobado())
            System.out.println("FINAL 1: Esta aprobado");
        else
            System.out.println("FINAL 1: No esta aprobado");

        // Verificando si el parcial se puede recuperar:
        if(parcial1.puedoRecuperar())
            System.out.println("PARCIAL 1: Se puede recuperar");
        else
            System.out.println("PARCIAL 1: No se puede recuperar, superaste los intentos");
        */
    }
}