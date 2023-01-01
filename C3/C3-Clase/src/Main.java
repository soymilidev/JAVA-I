/*
En la veterinaria tienen perros de diferentes tipos. Cada uno de ellos come una cantidad fija de
alimento balanceado por día. El proveedor de alimentos le envía un pack con diferentes
cantidades de alimento. En cada uno hay sobres con pequeñas raciones para que se consuman
por cada día, sabiendo que deben darles por lo menos 3 kg por día para que cada perro no se
sienta con hambre y ladre toda la noche.

Precisamos hacer un programa que nos ayude a simular la situación: Pedirá primero el nombre
y la cantidad de comida que come el perro. La idea es que mediante una función llamada
cuantosPaquetes indique el nombre y cuantos paquetes usará. Dada la cantidad necesaria la
función cuantosPaquetes pedirá uno a uno los pesos de cada paquete hasta llegar a esa
cantidad y retorna el número de paquetes que precisó.

Ejemplo:
Rintintin come 4 kg diarios.
paquetes : 1.2 0.7 1.1 1.3
resultado: Rintintin precisa 4 paquetes.
 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String nombrePerro;
        int cantidadComida, cantidadPaquetes;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el nombre de la mascota: ");
        nombrePerro = scanner.nextLine();
        System.out.println("Ingrese la cantidad de comida que come el perro: ");
        cantidadComida = scanner.nextInt();
        //a cantidad de cantidadPaquetes asignarle el resultado de la funcion calcuarPaquetes
        cantidadPaquetes=calcuarPaquetes(cantidadComida);
        System.out.println("Se necesitan " + cantidadPaquetes + " paquetes para alimentar a " + nombrePerro);
    }

    public static int calcuarPaquetes(int cant)
    {
        Scanner scanner = new Scanner(System.in);
        float pesoPaquete, pesoAcumulado;
        int contador=0;

        System.out.println("Ingreso peso paquete: ");
        pesoPaquete= scanner.nextFloat();
        pesoAcumulado=pesoPaquete;
        contador++;
        //sumo con el contador

        //si la cantidad es mayor al peso acumulado continuo ingresando
        while(cant>pesoAcumulado)
        {
            System.out.println("Ingreso peso paquete: ");
            pesoPaquete= scanner.nextFloat();
            pesoAcumulado+=pesoPaquete;
            contador++;
        }
        return contador;
    }
}