import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        Revista miRevista=new Revista("Fabrica", "002022", "mensual");
        Articulo miArticulo= new Articulo("Julio Cortazar","Literatura","MC","01-01-2022");
        Articulo miArticulo2= new Articulo("Lucio Seneca","Filosofia","MC","01-01-2022");
        miRevista.nuevaEdicion(6);

        Edicion misEdiciones[]= miRevista.getEdiciones();
        //Le pide todas las ediciones (get.ediciones). En este momento solo hay 1.
        misEdiciones[1].setPrecio(450.00);
        misEdiciones[1].setFechaEdicion("02-02-2022");
        misEdiciones[1].agregarArticulo(miArticulo);
        misEdiciones[1].agregarArticulo(miArticulo2);
        //1 = edicion 1. Agrego articulos a la edicion 1, hasta 12.
        //System.out.println(miRevista.toString());
        System.out.println(misEdiciones[1].toString());
    }
}