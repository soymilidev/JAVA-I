import java.util.Arrays;
public class Revista {
    private int numero;
    private String nombre;
    private String codigo;
    private String periodicidad;
    private Edicion ediciones[];
    //Edicion lo utilizo como un tipo de dato
    //Array ediciones, van a ser muchas variables ---> luego le decimos que van a ser 100

    public Revista(String nombre, String codigo, String periodicidad)
    {
        this.nombre=nombre;
        this.codigo=codigo;
        this.periodicidad=periodicidad;
        ediciones= new Edicion[100];
        //tamaño array para empezar a usarlo, forma de guardar. NO es que solo voy a tener 100 ediciones.
        //Es parte de lo que necesito para que el objeto comience a funcionar
        numero=1;
        //Quiero que empiece en 1
    }
    public void nuevaEdicion(int cantidad)
    {   Edicion nueva=new Edicion(numero, cantidad);
        //Creo una edicion, le asigno el numero que le corresponde 1, 2, 3...
        //Cantidad de articulos
        ediciones[numero]=nueva;
        //Guardo las ediciones en un array, incluida la nueva
        //la posicion 0 queda vacia
        //Si quiero usar la posicion 0 seria: ediciones[numero-1]=nueva;
        numero++;
    }
    //Que numero actual
    public Edicion[] getEdiciones() {

        return ediciones;
    }

    public String toString() {
        return "REVISTA" + "\n" +
                "numero: " + numero + "\n" +
                "nombre: " + nombre + "\n" +
                "codigo: " + codigo + "\n" +
                "periodicidad: " + periodicidad + "\n"
                +"ediciones: " + Arrays.toString(ediciones)
                ;
    }
}

//toString es un metodo de objetos, pero un array no es un objeto... es una estructura
//El array para mostrarlo se recorre con un for.
