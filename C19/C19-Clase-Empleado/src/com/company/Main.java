package com.company;

public class Main {

    public static void main(String[] args) {
	// Factory es abstracto, no puedo instanciarlo.
    // get instance esta pidiendo la informacion que esta en empleado factory

    EmpleadoFactory empleadoFactory = EmpleadoFactory.getInstance(); //No hago un new, le pido la instancia
    Empresa empresa = new Empresa("C4 S.A");

    //OPCION 1
    empresa.agregarEmpleado(empleadoFactory.crearEmpleado(EmpleadoFactory.CODIGO_EMPLEADO_POR_HORA));
    empresa.agregarEmpleado(empleadoFactory.crearEmpleado(EmpleadoFactory.CODIGO_EMPLEADO_POR_HORA));
    //Modificando los datos
    Empleado nuevo = empresa.verEmpleado(0);
    nuevo.setApellido("Messi");

    //OPCION 2
    empresa.agregarEmpleado(empleadoFactory.crearEmpleado("EMP-PH"));
    empresa.agregarEmpleado(empleadoFactory.crearEmpleado("EMP-RD1"));
    empresa.agregarEmpleado(empleadoFactory.crearEmpleado("EMP-RD2"));

    System.out.println(empresa.calcularSueldosTotales());
    }
}