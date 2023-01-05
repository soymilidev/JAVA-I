package com.company;

public class CuentaCorriente extends Cuenta implements  ImpuestoGravable{
    private double descubiertoPermitido;
    public  CuentaCorriente(double saldo)
    {
        super();
        setSaldo(saldo);
    }

    public double getDescubiertoPermitido() {

        return descubiertoPermitido;
    }

    public void setDescubiertoPermitido(double descubiertoPermitido) {
        this.descubiertoPermitido = descubiertoPermitido;
    }


    @Override
    public void extraer(double monto) {
        if(informarSaldo() + descubiertoPermitido <= monto)
            setSaldo(informarSaldo() - monto);
    }

    @Override
    public double gravar(double porcentaje) {
        double impuesto=(informarSaldo() / 100*porcentaje);
        setSaldo(informarSaldo()-impuesto);
        return impuesto;
    }

    @Override
    public double gravar( )
    {
        double impuesto = informarSaldo() / 100*1;
        setSaldo(informarSaldo()-impuesto);
        return impuesto;
    }
}