package com.company;

public class CajaAhorro extends Cuenta implements Comparable<CajaAhorro>{
    public static final double INTERES_CAJA_AHORRO = 1.2;

    //Constructor
    public CajaAhorro(double saldo)
    {
        super();
        setSaldo(saldo);
    }

    @Override
    public void extraer(double monto) {
        if(informarSaldo() <= monto)
            setSaldo(informarSaldo() - monto);
    }

    public void cobrarIntereses() {
        setSaldo(informarSaldo() * CajaAhorro.INTERES_CAJA_AHORRO);
    }

    @Override
    public int compareTo(CajaAhorro o) {
        if (this.informarSaldo()==o.informarSaldo())
            return 0;
        if(this.informarSaldo()>o.informarSaldo())
            return 1;
        return -1;
    }
}