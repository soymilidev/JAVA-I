package com.company;

public class Cliente {
    private String nombre;
    private String apellido;
    private String DNI;
    private double saldoEnCuenta;
    private double limite;

    public Cliente(String nombre, String apellido, String DNI, double limite) throws ClienteException {
        this.nombre = nombre;
        this.apellido = apellido;
        this.DNI = DNI;
        //¿Genero la excepcion en el constructor para no hacer uno por uno? ¿Salta en el Main?
        if (limite<0)
            //Con throw lanzamos una excepción en ejecución, para hacerlo la creamos con el new la nueva excepción.
            throw  new ClienteException("el limite no puede ser negativo");
        this.limite = limite;
        saldoEnCuenta = 0;
    }

    //Cuando compro aumenta el saldo en cuenta
    //No tengo que dejarle gastar + dinero del que permite el limite
    public void comprar(double importe) throws ClienteException {
        if(importe+saldoEnCuenta<limite)
            saldoEnCuenta+=importe;
        //En el caso contrario lanzo la excepcion
        else throw  new ClienteException("No tiene mas limite");
    }

    public void saldarDeuda(double importe) throws ClienteException {
        if (saldoEnCuenta==0)
            throw  new ClienteException("No hay deuda");
        saldoEnCuenta-=importe;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                nombre + ' ' +
                apellido + ' ' +
                ", su saldo es=" + saldoEnCuenta + "$ }";
    }
}