/*
Identificar, modelar e implementar en Java la clase involucrada en el enunciado
especificando sus atributos, responsabilidades, al menos dos constructores y los
correspondientes getters, y setters.
Para una institución que adopta perros se requiere tener de ellos: si están en adopción o
no, raza, año aproximado de nacimiento, peso, si tiene o no chip, si está o no lastimado y el
nombre de pila que le asignaron en la institución.
Deberemos poder preguntar la edad de un perro y si es un perro factible de perderse
—entendiendo que los perros que tienen chip son los que no se pueden perder—. Por otro
lado, se puede enviar a adopción a un perro si no está lastimado y su peso es mayor a 5 kg.
*/

package com.company;

public class Perro {
    private String nombre;
    private String raza;
    private int anioNacimiento, anioActual, calcularEdad;
    private double peso;
    private boolean tieneChip;
    private boolean estaHerido;
    private boolean adopcion;


    public Perro(String nombre, String raza, int anioNacimiento, int anioActual, double peso, boolean tieneChip, boolean estaHerido, boolean adopcion) {
        this.nombre = nombre;
        this.raza = raza;
        this.anioActual = anioActual;
        this.anioNacimiento = anioNacimiento;
        this.peso = peso;
        this.tieneChip = tieneChip;
        this.estaHerido = estaHerido;
        this.adopcion = posibilidadAdopcion(this.estaHerido, this.peso);
    }

    /*
    NO FUNCIONA
    public int calcularEdad(int anioActual, int anioNacimiento){

        return this.anioActual - this.anioNacimiento;
    }
    */

    public void mensajeEdad(){
        System.out.printf(nombre + " tiene " + calcularEdad + " años \n\n");
    }

    public boolean posibilidadPerderse() {
            return !tieneChip;
    }

    public void mensajePerderse(){
        if(this.tieneChip){
            System.out.printf(nombre + " tiene chip, NO puede perderse. \n");
        } else {
            System.out.printf(nombre + " NO tiene chip, puede perderse. \n");
        }
    }

    public boolean posibilidadAdopcion(boolean estaHerido, double peso){
        return !estaHerido && peso > 5.0;
    }
    public void mensajeAdopcion(){
        if(this.adopcion){
            System.out.printf(nombre + " puede ser adopatado. Se encuentra sano y tiene más de 5 kg. \n");
        } else {
            System.out.printf(nombre + " NO puede ser adopatado. Se encuentra herido y/o y tiene menos de 5 kg. \n");
        }
    }

    public int getAnioNacimiento() {
        return anioNacimiento;
    }

    public int getAnioActual() {
        return anioActual;
    }

    public void setAnioActual(int anioActual) {
        this.anioActual = anioActual;
    }

    public void setAnioNacimiento(int anioNacimiento) {
        this.anioNacimiento = anioNacimiento;
    }


    public int getCalcularEdad() {
        return calcularEdad;
    }

    public void setCalcularEdad(int calcularEdad) {
        this.calcularEdad = calcularEdad;
    }


    public String toString() {
        return
                "DATOS" + '\n' +
                "nombre: " + nombre + '\n' +
                "raza: " + raza + '\n' +
                "anioNacimiento: " + anioNacimiento + '\n' +
                "anioActual: " + anioActual + '\n' +
                "calcularEdad: " + (anioActual - anioNacimiento) + '\n' +
                "peso (kg): " + peso + '\n' +
                "tieneChip: " + tieneChip + '\n' +
                "estaHerido: " + estaHerido + '\n' +
                "adopcion: " + adopcion + '\n'
                ;
    }
}

    /*
    public int calcularEdad() {

        return 2022 - anioNacimiento;
    }

    public void posibilidadAdopcion() {
        if (this.peso >= 5.00 && !this.estaHerido) {
           this.adopcion = true;
    }

     public void mensajeAdopción () {
         if (adopcion) {
             System.out.println("El perro puede ser adoptado");
         } else {
             System.out.println("El perro NO puede ser adoptado");
         }
     }
    */


