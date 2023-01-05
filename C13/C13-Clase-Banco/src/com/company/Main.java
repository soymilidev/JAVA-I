package com.company;

public class Main {
    public static void main(String[] args) {
        CajaAhorro cajaAhorro1 = new CajaAhorro(1000);
        //ca.setSaldo(100);
        cajaAhorro1.cobrarIntereses();
        CajaAhorro cajaAhorro2 = new CajaAhorro(5000);
        System.out.println(cajaAhorro1.informarSaldo());
        System.out.println(cajaAhorro2.informarSaldo());
        if (cajaAhorro1.compareTo(cajaAhorro2)==1)
            System.out.println("Ca es mayor");
        else if(cajaAhorro1.compareTo(cajaAhorro2)==-1)
            System.out.println("CajaAhorro2 es mayor");
        else
            System.out.println("Son iguales");

        System.out.println(cajaAhorro1.informarSaldo());
        CuentaCorriente cc= new CuentaCorriente(5000);
        Cuenta cuenta=new CuentaCorriente(1000);
    }
}

