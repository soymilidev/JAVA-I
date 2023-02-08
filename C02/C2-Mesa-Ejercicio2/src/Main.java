/*
Ejercicio 2
Escribir una función que reciba tres números y devuelva el máximo entre los tres números.
Integer maximoEntreTresNumeros(Integer unNumeroA, Integer unNumeroB, Integer unNumeroC)
Luego hacer un programa que permita el ingreso de 3 valores, utilice la función y muestre el resultado.
 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Integer unNumeroA, unNumeroB, unNumeroC;

        System.out.print("Introduzca el primer número: ");
        unNumeroA = scanner.nextInt();
        System.out.print("Introduzca el segundo número: ");
        unNumeroB = scanner.nextInt();
        System.out.print("Introduzca el tercer número: ");
        unNumeroC= scanner.nextInt();
        maximoEntreTresNumeros(unNumeroA, unNumeroB, unNumeroC);
    }
    public static Integer maximoEntreTresNumeros(Integer unNumeroA, Integer unNumeroB, Integer unNumeroC) {
        if (unNumeroA > unNumeroB) {
            if (unNumeroA > unNumeroC) {
                System.out.println("El mayor es: " + unNumeroA);
            } else {
                System.out.println("El mayor es: " + unNumeroC);
            }
        } else if (unNumeroB > unNumeroC) {
            System.out.println("El mayor es: " + unNumeroB);
        } else {
            System.out.println("El mayor es: " + unNumeroC);
        }
        return unNumeroA + unNumeroB + unNumeroC;
    }
}
