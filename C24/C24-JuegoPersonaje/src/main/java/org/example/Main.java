package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Personaje figura= new Personaje("Asterix");
        Habilidad simple1 = HabilidadFactory.getInstance().crearHabilidad(HabilidadFactory.SIMPLE);
        Habilidad simple2 = HabilidadFactory.getInstance().crearHabilidad(HabilidadFactory.SIMPLE);
        Habilidad combinada1 = HabilidadFactory.getInstance().crearHabilidad(HabilidadFactory.COMBINADA);

        cargaDeInfo(simple1);
        cargaDeInfo(simple2);
        cargaDeInfo(combinada1);


        try {
            cargarSimples(combinada1,simple1);
            cargarSimples(combinada1,simple2);
        }catch (Exception e){
            System.out.println("Error, intentelo nuevamente");
        }

        figura.agregarHabilidad(simple1);
        figura.agregarHabilidad(simple2);
        figura.agregarHabilidad(combinada1);
        System.out.println(figura.mostrarHabilidad());
    }


    public static void cargaDeInfo(Habilidad h){
        Scanner scanner = new Scanner(System.in);

        if(h instanceof Simple){
            System.out.println("Habilidad simple: ");
            h.setNombre(scanner.nextLine());                            /*VER ESTA LINEA*/
            /*
            System.out.println("Descripcion de habilidad simple: ");
            ((Simple) h).setDescripcion(scanner.nextLine());
             */
            System.out.println("Puntaje: ");
            ((Simple) h).setPuntaje(scanner.nextDouble());
        }
        if(h instanceof Combinada){
            System.out.println("Habilidad combinada: ");
            h.setNombre(scanner.nextLine());
            /*
            System.out.println("Descripcion de habilidad combinada: ");
            ((Combinada) h).setDescripcion(scanner.nextLine());
             */
            System.out.println("Factor multiplicador: ");
            ((Combinada) h).setFactorMultiplicador(scanner.nextInt());
        }

    }

    public static void cargarSimples(Habilidad combinada, Habilidad simple) throws Exception {
        if(combinada instanceof Combinada){
            ((Combinada)combinada).agregarSimple(simple);
        }else{
            throw new Exception("Error, intentelo nuevamente");
        }

    }
}