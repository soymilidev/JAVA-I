package com.company;

public class Cliente {
    //Definir atributos como privados, fuera de la clase no se tienen que modificar
    private Integer numeroCliente;
    private String nombre;
    private Double saldo;

    public Cliente(Integer numeroCliente, String nombre) {
        this.numeroCliente = numeroCliente;
        this.nombre = nombre;
        //inicio en cero el saldo de la cuenta, su dueda es cero.
        saldo = 0.0;
    }

    public void incrementarDeuda(Double valor) {

        saldo += valor;
    }

    public void pagarDeuda() {
        //pago la deuda, queda en cero
        saldo = 0.0;
    }

    //Creo un método con la información que quiero que devuelva en el main
    //para no estar creando uno por uno
    public String toString() {

        return "Nombre:" + nombre + " Numero:" + numeroCliente + " Saldo:" + saldo;
    }


    //Acceder (get), modificar (set)
    public Integer getNumeroCliente() {

        return numeroCliente;
    }

    public void setNumeroCliente(Integer numeroCliente) {

        this.numeroCliente = numeroCliente;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {

        this.nombre = nombre;
    }

    public Double getSaldo() {
        return saldo;
    }

    public void setSaldo(Double saldo) {

        this.saldo = saldo;
    }
}