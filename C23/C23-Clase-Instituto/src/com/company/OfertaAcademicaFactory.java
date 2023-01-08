package com.company;

public class OfertaAcademicaFactory {
    private static OfertaAcademicaFactory instancia;

    public static final String CURSO="Curso";
    public static final String PROGRAMA="Programa";

    private OfertaAcademicaFactory(){

    }

    public static OfertaAcademicaFactory getInstancia(){
        if(instancia==null)
            instancia=new OfertaAcademicaFactory();
        return instancia;
    }

    public OfertaAcademica crearOfertaAcademica(String codigo)
    {
        switch (codigo)
        {
            case CURSO:
                return new Curso();
            case PROGRAMA:
                return new Programa();
        }
        return null;
    }

}