package com.company;

public class Main {

    public static void main(String[] args) {
        try {
            Cliente nuevo = new Cliente("Lionel", "Messi", "3000000", -15000);
            //Voy a poder hacer lo siguiente solo si esta el cliente:
            //Dependiendo del importe del limite, se va a ejecutar uno u otro mensaje
            nuevo.saldarDeuda(1000.0);
            nuevo.comprar(65000);
        }
        catch(ClienteException c)
        {
            //Con el toString envia el mensaje especifico de cada uno
            System.out.println(c.toString());
        }
    }
}