package com.company;

public class PacienteException extends  Exception{
    public PacienteException(String mensaje)
    {
        //utilizo el super de la clase de la cual hereda
        super(mensaje);
    }

    public String toString()
    {
        return "ERROR - " + getMessage();
    }
}