package com.company;

public class Impresora {
    private String modelo;
    private String tipoConexion;
    private String fechaFabricacion;
    private int cantidadHojas;

    //Generar constructor, clic izquierdo Generate...
    public Impresora(String modelo, String tipoConexion, String fechaFabricacion) {
        this.modelo = modelo;
        this.tipoConexion = tipoConexion;
        this.fechaFabricacion = fechaFabricacion;
    }

    //Metodos
    //PRIVATE porque es un asunto, problema de la impresora si tiene o no hojas.
    private boolean tieneHojas()
    /*
    //Opcion 1
    {
        if (cantidadHojas > 0)
            return true;
    } else {
        return false;
    }
    */

    //Opcion 2
    //es una pregunta que me devuelve true o false
    {
        return cantidadHojas > 0;
    }

    //VOID es una acción y cambio el atributo, no estoy esperando una respuesta. Una acción que hizo.
    public void imprimir(String texto)
    {
        if(tieneHojas())
        {
            System.out.println(texto);
            cantidadHojas--;
        }
    }

    public void agregarHojas(int hojas)
    {
        cantidadHojas += hojas; //suma las hojas, si habia no las pierdo
    }

    //Informacion relevante para ver de la impresora
    //TO STRING cuando estoy trabajando que informacion puedo llegar a consultar
    public String toString()
    {
        return "Cantidad de hojas: " + cantidadHojas;
    }
}