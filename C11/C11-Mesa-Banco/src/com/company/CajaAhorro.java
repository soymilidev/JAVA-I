package com.company;

public class CajaAhorro extends Cuenta {
    private double interes;

    public CajaAhorro(Cliente cliente, long numeroCuenta, String sucursal, double saldo, double interes) {
        super(cliente, numeroCuenta, sucursal, saldo);
        this.interes = interes;
    }

    @Override
    public void extraer(double monto){
        System.out.println("\nExtraccion: $" + monto);
        if(monto<=getSaldo()){
            System.out.println("La operacion se ha realizado con exito");
            setSaldo(getSaldo()-monto);
        }else{
            System.out.println("Saldo insuficiente para extraer");
        }
    }

    public void cobrarInteres(){
        setSaldo((getSaldo() * interes / 100) + getSaldo());
        System.out.println("Interes: "+ interes + "%");
    }
}