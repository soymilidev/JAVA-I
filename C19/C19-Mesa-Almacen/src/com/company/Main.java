package com.company;

public class Main {
    public static void main(String[] args) {
        Almacen almacen = new Almacen("LaScaloneta S.A.");

        Caja caja1 = (Caja) ProductoFactory.getInstance().crearProducto("CAJA10X10");
        Pelota pelota1 = (Pelota) ProductoFactory.getInstance().crearProducto("PELOTAFUTBOL");
        Pelota pelota2 = (Pelota) ProductoFactory.getInstance().crearProducto("PELOTATENIS");

        System.out.println("VOLUMEN CAJA 1: " + caja1.calcularEspacio()+"cm3");
        System.out.println("VOLUMEN PELOTA 1: " + pelota1.calcularEspacio()+"cm3");
        System.out.println("VOLUMEN PELOTA 2: " + pelota2.calcularEspacio()+"cm3");

        almacen.getLista().add(caja1);
        almacen.getLista().add(pelota1);
        almacen.getLista().add(pelota2);

        double total = almacen.calcularEspacioNecesario();
        System.out.println("Cantidad de espacio necesario para guardar todos los productos del almacen: " + total + "cm3");
    }
}