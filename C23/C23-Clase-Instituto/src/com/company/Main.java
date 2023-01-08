package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Instituto instituto=new Instituto("Digital House");

        OfertaAcademica oferta1= OfertaAcademicaFactory.getInstancia().crearOfertaAcademica(OfertaAcademicaFactory.CURSO);
        OfertaAcademica oferta2= OfertaAcademicaFactory.getInstancia().crearOfertaAcademica(OfertaAcademicaFactory.CURSO);
        OfertaAcademica oferta3= OfertaAcademicaFactory.getInstancia().crearOfertaAcademica(OfertaAcademicaFactory.PROGRAMA);

        cargarDatos(oferta1);
        cargarDatos(oferta2);
        cargarDatos(oferta3);

        try {
            cargarCursos(oferta3, oferta1);
            cargarCursos(oferta3, oferta2);
        }
        catch (Exception e)
        {
            System.out.println("Error al cargar cursos");
        }

        instituto.agregarOfertaAcademica(oferta1);
        instituto.agregarOfertaAcademica(oferta2);
        instituto.agregarOfertaAcademica(oferta3);
        instituto.generarInforme();

    }
    public static  void cargarCursos(OfertaAcademica programa, OfertaAcademica curso) throws Exception {
        if (programa instanceof  Programa)
            ((Programa)programa).agregarOferta(curso);
        else
            throw new Exception("No se puede cargar cursos en un curso");
    }

    public static void cargarDatos(OfertaAcademica oferta)
    {   Scanner scanner = new Scanner(System.in);
        if(oferta instanceof  Curso) {
            System.out.println("Por favor ingresa el nombre: ");
            oferta.setNombre(scanner.nextLine());
            System.out.println("Por favor digite la Carga Horaria Mensual");
            ((Curso) oferta).setCargaHorariaMensual(scanner.nextInt());
            System.out.println("Por favor digite la duracion del curso");
            ((Curso) oferta).setDuracionMeses(scanner.nextInt());
            System.out.println("Por favor digite el valor de la hora");
            ((Curso) oferta).setValorHora(scanner.nextInt());
        }
        if(oferta instanceof  Programa) {
            System.out.println("Por favor ingresa el nombre: ");
            oferta.setNombre(scanner.nextLine());
            System.out.println("Por favor digitar la bonificacion");
            ((Programa) oferta).setPorcentajeBonificacion(scanner.nextDouble());
        }

    }
}