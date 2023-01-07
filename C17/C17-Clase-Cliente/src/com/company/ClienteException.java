package com.company;

public class ClienteException extends  Exception{
    public ClienteException(String mensaje)
    {
        //utilizo el super de la clase de la cual hereda
        super(mensaje);
    }

    //getMessage() es el que me pasaron por parametro (mensaje): public ClienteException(String mensaje)
    public String toString()
    {
        return "Error en el saldo de cuenta " + getMessage();
        //Otra opcion, dame la clase y de la clase su nombre:
        //return "Error en el saldo de cuenta " + this.getClass().getName() + getMessage();
        //Devolveria lo siguiente: Error en el saldo de cuenta com.company.ClienteExceptionel limite no puede ser negativo
    }
}