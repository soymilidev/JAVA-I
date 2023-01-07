package com.company;

import java.util.ArrayList;
import java.util.List;

public class Puerto {
    private String nombre;

    //utilizamos una colección ArrayList y solo almacena <Contenedor>
    private List<Contenedor> contenedores=new ArrayList<>();

    public Puerto(String nombre) {
        this.nombre = nombre;
    }

    /*
    //OTRA FORMA
    private String nombre;
    private List<Contenedor> contenedores;

    //Crear el constructor con la lista
    public Puerto(String nombre)
    {
        this.nombre=nombre;
        contenedores=new ArrayList<>();
    }
    */

    public String getNombre() {
        return nombre;
    }

    public void agregarContenedor(Contenedor nuevo){

        contenedores.add(nuevo);
    }

    //Ordenar contenedores
    public void mostrarContenedores(){
        //recorremos la lista de contenedores. Como usamos Generics directamente recorremos contenedores y no object
        for(Contenedor contenedor : contenedores)
            System.out.println(contenedor.getId());
    }
    public void mostrarContenedoresOrdenadosPorId()
    {
        contenedores.sort(null);
        //Con esta linea recorre los datos, no solo ID.
        for(Contenedor contenedor : contenedores){
            System.out.println(contenedor.toString());
        }
    }

    /*
    //OTRA FORMA, solo muestra el ID
    public void mostrarContenedoresOrdenadosPorId()
    {
        contenedores.sort(null);
        mostrarContenedores();
    }
    */

    //Contenedores peligrosos y desconocidos
    public int cantidadContenedoresPeligrosos(){
        int resultado=0;
        for(Contenedor contenedor : contenedores){
            if(contenedor.getPaisOrigen().equals("Desconocida")) {
                resultado += contenedor.getMaterialPeligroso().compareTo(false);
            }
        }
        return resultado;
    }

    @Override
    public String toString() {
        return "PUERTO" + '\n' +
                "Nombre: " + nombre + '\n' +
                "Contenedores: " + contenedores + '\n' +
                "--------------------------------------"
                ;
    }
}