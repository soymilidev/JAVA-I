package com.company;

public class CuentaCorriente extends Cuenta {
    private double montoAutorizado;

    public CuentaCorriente(Cliente cliente, long numeroCuenta, String sucursal, double saldo, double montoAutorizado) {
        super(cliente, numeroCuenta, sucursal, saldo);
        this.montoAutorizado = montoAutorizado;
    }

    public double getMontoAutorizado() {

        return montoAutorizado;
    }

    public void setMontoAutorizado(double montoAutorizado) {

        this.montoAutorizado = montoAutorizado;
    }

    @Override
    public void extraer(double monto){
        System.out.println("\nExtraccion: $"+ monto);
        if(monto<=getSaldo()){
            System.out.println("La operacion se ha realizado con exito");
            setSaldo(getSaldo()-monto);
        } else if (monto<=(montoAutorizado + getSaldo())){
            System.out.println("La operacion se ha realizado con exito");
            setSaldo(getSaldo()-monto);
            montoAutorizado = montoAutorizado+getSaldo()-monto;
        } else{
            System.out.println("Saldo insuficiente para extraer");
        }
    }
}