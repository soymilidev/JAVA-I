package com.company;

public abstract class Cuenta {
    private Cliente cliente;
    private long numeroCuenta;
    private String sucursal;
    private double saldo;

    public Cuenta(Cliente cliente, long numeroCuenta, String sucursal, double saldo) {
        this.cliente = cliente;
        this.numeroCuenta = numeroCuenta;
        this.sucursal = sucursal;
        this.saldo = saldo;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public long getNumeroCuenta() {
        return numeroCuenta;
    }

    public String getSucursal() {
        return sucursal;
    }

    public double getSaldo() {
        return saldo;
    }
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void depositar(double monto){
        saldo += monto;
        System.out.println("\nDepositar: $" + monto);
        //System.out.println("Saldo total: $" + saldo);
    }

    public void informarSaldo(){
        System.out.println("Saldo actual: $" + saldo);
        //System.out.println("Saldo actual: $" + String.format("%.2f",saldo));
        //Para redondear los ultimos dos digitos
    }

    public abstract void extraer(double monto);

    /*
    @Override
    public String toString() {
        return "Cuenta{" +
                "cliente=" + cliente +
                ", numeroCuenta=" + numeroCuenta +
                ", sucursal='" + sucursal + '\'' +
                ", saldo=" + saldo +
                '}';
    }
    */
}