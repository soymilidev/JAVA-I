package com.company;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Cliente cliente1 = new Cliente(1234, "Juan", "Perez", 30000000, 233000004);
        CajaAhorro cajaAhorro1 = new CajaAhorro(cliente1, 243000005, "Aconcagua", 10000, 10 );
        CuentaCorriente cuentaCorriente1 = new CuentaCorriente(cliente1,243000005, "Aconcagua", 15000, 15000);

        System.out.println(cliente1.toString());
        //System.out.println(cajaAhorro1.informarSaldo());
        //System.out.println(cajaAhorro1.cobrarInteres());
        //System.out.println(cuentaCorriente1.toString());
        System.out.println("----------------------------------------");
        System.out.println("CAJA DE AHORRO");
        cajaAhorro1.informarSaldo(); //Saldo actual
        cajaAhorro1.extraer(500); //Extraccion
        cajaAhorro1.informarSaldo(); //System.out.println(cajaAhorro1.getSaldo());


        System.out.println("----------------------------------------");
        cajaAhorro1.informarSaldo();
        cajaAhorro1.extraer(11000);
        cajaAhorro1.informarSaldo();


        System.out.println("----------------------------------------");
        cajaAhorro1.informarSaldo();
        cajaAhorro1.depositar(5000);
        cajaAhorro1.informarSaldo();


        System.out.println("----------------------------------------");
        cajaAhorro1.informarSaldo();
        cajaAhorro1.cobrarInteres();
        cajaAhorro1.informarSaldo();


        System.out.println("----------------------------------------");
        System.out.println("CUENTA CORRIENTE");
        cuentaCorriente1.informarSaldo();
        cuentaCorriente1.extraer(15000);
        cuentaCorriente1.informarSaldo();

        System.out.println("----------------------------------------");
        cuentaCorriente1.informarSaldo();
        cuentaCorriente1.extraer(15000);
        cuentaCorriente1.informarSaldo();

        System.out.println("----------------------------------------");
        cuentaCorriente1.informarSaldo();
        cuentaCorriente1.extraer(20000);
        cuentaCorriente1.informarSaldo();
    }
}