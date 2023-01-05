package com.company;

public class Final extends Examen implements Comparable<Final>{

    private double notaOral;
    private String descripcionTema;

    /*
    //OTRA FORMA
    public Final(Alumno alumno, double notaOral, String descripcionTema) {
        super(alumno);
        this.notaOral = notaOral;
        this.descripcionTema = descripcionTema;
    }
    */
    public Final(String titulo, String enunciado, double nota, Alumno alumno, double notaOral, String descripcionTema) {
        super(titulo, enunciado, nota, alumno);
        this.notaOral = notaOral;
        this.descripcionTema = descripcionTema;
    }


    @Override
    public boolean estaAprobado()
    {
        if (getNota() >= 4 && notaOral>= 4)
            return true;
        else
            return false;
    }

    @Override
    public int compareTo(Final o) {
        if(promedio()>o.promedio())
            return 1;
        else if(promedio()<o.promedio())
            return -1;
        return 0;
    }
    private  double promedio()
    {
        return (getNota() + notaOral)/2;
    }


    @Override
    public String toString() {
        return
                //"-------------------------------------------" + '\n' +
                "FINAL" + '\n'+
                "Nota oral: " + notaOral + '\n' +
                "Descripcion del tema: " + descripcionTema + '\n' +
                "-------------------------------------------"
                ;
    }
}