package com.company;

public class EmpleadoFactory {

    //Facilitar la lectura del codigo
    //Final --> valores que no se pueden cambiar, son constantes
    //Static --> son objetos de la clase. Voy a tener uno.
    public static final String CODIGO_EMPLEADO_RELACION_CATEGORIA_1 = "EMP-RD1";
    public static final String CODIGO_EMPLEADO_POR_HORA = "EMP-PH";
    public static final String CODIGO_EMPLEADO_RELACION_CATEGORIA_2 = "EMP-RD2";
    private static EmpleadoFactory instance; //Genera los empleados. La instacia de clase siempre son estaticas.

    private EmpleadoFactory(){ //Vacio porque no guarda empleados, solo genera
    }

    public static EmpleadoFactory getInstance() {
        if(instance == null){
            instance = new EmpleadoFactory(); //crea (estaba en null)
        }
        return instance;
    }

    public Empleado crearEmpleado(String codigo){
        switch (codigo) {
            case CODIGO_EMPLEADO_RELACION_CATEGORIA_1:
                //crear empleado en relacion de dependencia
                return new EmpleadoRelacionDependencia(1000.0);
            case CODIGO_EMPLEADO_RELACION_CATEGORIA_2:
                return new EmpleadoRelacionDependencia(800.0);
            case CODIGO_EMPLEADO_POR_HORA:
                // crear y retornar un empleado por hora
                return new EmpleadoPorHora();
            default:
                return null;
        }
    }
}