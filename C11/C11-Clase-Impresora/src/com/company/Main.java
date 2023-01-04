package com.company;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Date dia= new Date();
        Impresora impresora; //NO se pueden crear objetos de una clase abstracta: =new Impresora("Epson",dia, "USB");
        //Si se puede definir un objeto a traves del nombre, pero no crear una instancia.
        Impresora impresora1;
        impresora = new ImpresoraCanon("Canon",dia, "USB");
        impresora1 = new ImpresoraEpson("Epson", dia, "USB");
        //ImpresoraEpson epson = new ImpresoraEpson("Epson", dia, "USB");
        String texto = impresora.imprimir();
        //imprimir sin importar la marca (epson, canon). Diferente es impresora1.imprimir()
        System.out.println(texto);

        //Array de impresoras
        //Reuno a todas en un solo lugar, que todas hagan el mismo trabajo, a su manera (poliformismo).
        Impresora[] impresoras= new Impresora[2];
        //Asigno una posicion
        impresoras[0] = impresora;
        impresoras[1] = impresora1;

        //Imprimi, recorre el array y a c/u de las impresoras le dice imprimi.
        for (int i =0; i<impresoras.length;i++)
            System.out.println(impresoras[i].imprimir());
    }
}