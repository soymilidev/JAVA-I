/*
Ejercicio 3
Escribir una función:
boolean cadenasDeTextoDistintas(String unTextoA, String unTextoB) que debe tomar dos cadenas de texto
y devolver true, en caso de que sean distintos, o false, en caso de que coincidan.
 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String unTextoA, unTextoB;

        System.out.print("Introduzca la primera palabra: ");
        unTextoA = scanner.nextLine();
        System.out.print("Introduzca la segunda palabra: ");
        unTextoB = scanner.nextLine();
        System.out.println("La primera palabra es distinta de la segunda: " + cadenasDeTextoDistintas(unTextoA, unTextoB));
    }

    public static boolean cadenasDeTextoDistintas(String unTextoA, String unTextoB) {
        if (!unTextoA.equals(unTextoB)) {
            return true;
        } else {
            return false;
        }
    }
}