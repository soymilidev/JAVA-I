import java.util.Arrays;
public class Edicion {
    private int numero;
    private String fechaEdicion;
    private Double precio;
    private Articulo articulos[];
    private int numeroArticulo;

    //El precio se decide cuando sale la edicion. Cuando la creo NO puedo ponerle el precio.
    public Edicion(int numero, int cantidadArticulos) {
        this.numero = numero;
        articulos= new Articulo[cantidadArticulos];
        //Array, guarda articulos
    }

    public void setFechaEdicion(String fechaEdicion) {

        this.fechaEdicion = fechaEdicion;
    }
    public void setPrecio(Double precio) {

        this.precio = precio;
    }
    public void agregarArticulo(Articulo articulo)
    {
        articulos[numeroArticulo]=articulo;
        numeroArticulo++;
    }
    //Crear una nueva edición que es una clase

    public String toString() {
        String temp = "";
        for (int i = 0; i < numeroArticulo; i++){
            temp += articulos[i].toString();
        }
        //Recorrer el array mientras haya articulos creados. Esos articulos que los vaya agregando a una cadena.
        //
        return "\n\n" + "EDICION" + "\n" +
                "numero: " + numero + "\n" +
                "fechaEdicion: " + fechaEdicion + "\n" +
                "precio: " + precio + "\n" +
                "articulos: " + temp + "\n" +
                "numeroArticulo: " + numeroArticulo + "\n\n"
                //antes: "articulos: " + Arrays.toString(articulos) + "\n"
                ;
    }
}

