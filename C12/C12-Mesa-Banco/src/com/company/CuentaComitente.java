package com.company;

public class CuentaComitente extends Cuenta {
    private String claveValidacion;

    public CuentaComitente(Cliente cliente, long numeroCuenta, String sucursal, double saldo, String claveValidacion) {
        super(cliente, numeroCuenta, sucursal, saldo);
        this.claveValidacion = claveValidacion;
    }

    public String getClaveValidacion() {
        return claveValidacion;
    }

    public void setClaveValidacion(String claveValidacion) {
        this.claveValidacion = claveValidacion;
    }

    @Override
    public void depositar(double monto) {
        //super.depositar(monto*0.99);
        setSaldo((monto * 99 / 100) + getSaldo());
        System.out.println("\nDepositar: $" + monto);
        System.out.println("Descuento del 1% por comision : $" + (getSaldo()-monto));
    }

    @Override
    public void extraer(double monto) {
        System.out.println("\nExtraccion: $" + monto);
        double porcentaje50 = (monto * 50 / 100);
        if (monto <= (getSaldo() - porcentaje50)) {
            setSaldo(getSaldo() - porcentaje50);
        }
    }

    public void extraer(double monto, String claveValidacion) {
        System.out.println("\nExtraccion: $" + monto);
        if (claveValidacion.equals(claveValidacion) && monto <= getSaldo()) {
            setSaldo(getSaldo() - monto);
        }
    }
}