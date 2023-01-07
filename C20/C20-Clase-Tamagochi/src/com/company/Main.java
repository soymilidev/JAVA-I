package com.company;

public class Main {
     public static void main(String[] args){
        Tamagochi tamagochi_1 = new Tamagochi("Tokio");
        //Van cambiado los estados, y cambia la accion, como resuelve. Crea un objeto distinto.
        tamagochi_1.come();
         System.out.println(tamagochi_1.getEstado().toString());
        tamagochi_1.toma();
         System.out.println(tamagochi_1.getEstado().toString());
        tamagochi_1.mimo();
         System.out.println(tamagochi_1.getEstado().toString());
        tamagochi_1.come();
         System.out.println(tamagochi_1.getEstado().toString());
     }
}