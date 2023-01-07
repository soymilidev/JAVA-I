package com.company;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) throws PacienteException {
        try {
            Paciente paciente = new Paciente("Martin","Buscaglia","241978", LocalDate.of(2022,12,14));
            paciente.darAlta(LocalDate.of(2022,12,15));
            System.out.println(paciente);
        }catch (PacienteException e){
        System.out.println(e.toString());
        //e.printStackTrace();
        // printStackTrace()--> Útil para diagnosticar excepciones. Que sucedió y en qué parte del código.
        }
    }
}