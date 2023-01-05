package com.company;

public class Main {
    public static void main(String[] args) {

        Capitan capitan1 = new Capitan("James", "Cook", "E223355");
        Capitan capitan2 = new Capitan("Julio", "Verne", "M112233");

        Velero velero1 = new Velero( 65.0, 100.0, 2010, 2.40, capitan1, 2);
        Velero velero2 = new Velero( 350.0, 100.0, 2021, 3.0, capitan2, 6);

        Yate yate1 = new Yate(600.0, 100.0, 2021, 11.0, capitan1, 4);
        Yate yate2 = new Yate(1200.0, 100.0, 2014, 12.0, capitan2, 8);


        if (yate1.compareTo(yate2)==1) {
            System.out.println("El Yate1 es mayor que el Yate2" + '\n');
        }else if(yate1.compareTo(yate2)==-1) {
            System.out.println("El Yate1 es menor que el Yate2" + '\n');
        }else{
            System.out.println("El Yate1 y el Yate2 son iguales" + '\n');
        }


        System.out.println("Precio (USD) de alquiler del velero1: " + velero1.calcularAlquiler());
        System.out.println("El velero es grande: " + velero1.esGrande());
        System.out.println(velero1.getCapitan());
        System.out.println("---------------------------------------------------------");

        System.out.println("Precio (USD) de alquiler del velero2: " + velero2.calcularAlquiler());
        System.out.println("El velero es grande: " + velero1.esGrande());
        System.out.println(velero2.getCapitan());
        System.out.println("---------------------------------------------------------");

        System.out.println("Precio (USD) de alquiler del yate1: " + yate1.calcularAlquiler());
        System.out.println(yate1.getCapitan());
        System.out.println("---------------------------------------------------------");

        System.out.println("Precio (USD) de alquiler del yate2: " + yate2.calcularAlquiler());
        System.out.println(yate2.getCapitan());
        System.out.println("---------------------------------------------------------");

        System.out.println("Yate1" + '\n' + yate1);

 /*
         if(yate1.compareTo(yate2) > 0){
            System.out.println("Yate1 es mayor que Yate2");
         }else if(yate1.compareTo(yate2) < 0){
            System.out.println("Yate1 es menor que Yate2");
         }else{
            System.out.println("Yate1 y Yate2 son iguales");
         }
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
    }
}