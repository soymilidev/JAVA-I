package com.company;

public class ProductoFactory {
    private static ProductoFactory instance; //Genera los productos.
    private ProductoFactory(){ //Vacio porque no guarda productos, solo genera
    }

    public static ProductoFactory getInstance() {
        if(instance == null){
            instance = new ProductoFactory(); //crea (estaba en null)
        }
        return instance;
    }

    public Producto crearProducto(String codigo) {
        switch (codigo) {
            case "CAJA10X10":
                //crear caja
                return new Caja(0.0, 10.0, 10.0, 10.0);
            //crear pelota de futbol
            case "PELOTAFUTBOL":
                return new Pelota(450.0, 11.0);
            case "PELOTATENIS":
                //crear pelota de tennis
                return new Pelota(58.5, 0.32);
            default:
                return null;
        }
    }
}