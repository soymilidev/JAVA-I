package com.company;

public abstract class Examen { private String titulo;
    private String enunciado;
    private double nota;
    private Alumno alumno;

    /*
    //OTRA FORMA 1
    public Examen (String nombre, String apellido, String legajo)
    {
        alumno = new Alumno(nombre, apellido, legajo);
    }

    //OTRA FORMA 2
    public Examen(Alumno alumno) {
        this.alumno= alumno;
    }
    */

    //Al momento de crear el examen NO hay nota...
    public Examen(String titulo, String enunciado, double nota, Alumno alumno) {
        this.titulo = titulo;
        this.enunciado = enunciado;
        this.nota = nota;
        this.alumno = alumno;
    }

    public double getNota() {
        return nota;
    }

    //Perspectiva: Un examen va a tener más de una nota, cuando sea un final (nota oral)...
    //Si hay que guardar la nota, hay que hacer un array...
    public boolean estaAprobado()
    {
        if (nota>=4)
            return true;
        else
            return false;
        //return nota>=4;
    }

    @Override
    public String toString() {
        return
                "EXAMEN" + '\n'+
                "Titulo: " + titulo + '\n'+
                "Enunciado: " + enunciado + '\n'+
                "Nota: " + nota + '\n'+
                //alumno.toString() + '\n' +
                //alumno.toString() porque es un objeto
                "-------------------------------------------"
                ;
    }
}