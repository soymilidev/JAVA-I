package com.company;

public class ServicioTecnico {

    public static void main(String[] args) {
        Reparacion unaReparacion = new Reparacion("Batidora");

        try{
            unaReparacion.valorPresupuesto(4500);
            unaReparacion.PasarAlSiguientePaso();
            unaReparacion.sumarRepuesto(800);
            unaReparacion.sumarRepuesto(250);
            unaReparacion.PasarAlSiguientePaso();
            unaReparacion.cambiarDireccion("742 Evergreen Terrace\n");
            unaReparacion.PasarAlSiguientePaso();
            unaReparacion.PasarAlSiguientePaso();

        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}