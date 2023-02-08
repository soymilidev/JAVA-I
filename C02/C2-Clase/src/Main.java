import java.util.Scanner;

public class Main {

    //PRIMER PASO QUE SE EJECUTA
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String nombre,apellido;
        String iniciales;
        String fecha;

        System.out.println("Ingrese su nombre");
        nombre = scanner.nextLine();
        System.out.println("Ingrese su apellido");
        apellido = scanner.next();
        iniciales = "" + nombre.charAt(0) + apellido.charAt(0);
        System.out.println(iniciales);

        //otras formas de hacerlo:
        //op2
        char inNombre, inApellido;
        System.out.println(iniciales);

        //op3
        iniciales = nombre.substring(0,1) + apellido.substring(0,1);
        //posicion "0" y "1 caracter"
        System.out.println(iniciales);

        fecha = ingresarFechaNacimiento();

        //llamo a la función
        mostrarResultado(iniciales, fecha);
    }
    
    //SEGUNDO PASO QUE SE EJECUTA
    public static String ingresarFechaNacimiento(){
        int dia, mes, anio;
        Scanner scanner = new Scanner (System.in);
        System.out.println("Ingrese su día de nacimiento: ");
        dia = scanner.nextInt();
        System.out.println("Ingrese su mes de nacimiento: ");
        mes = scanner.nextInt();
        System.out.println("Ingrese su anio de nacimiento: ");
        anio = scanner.nextInt();
        return dia + "/" + mes + "/" + anio;
    }

    public static void mostrarResultado(String iniciales, String fecha) {
        System.out.println("Las iniciales son " + iniciales + " y la fecha de nacimiento " + fecha);
    }
}