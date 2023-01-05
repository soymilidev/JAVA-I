package com.company;

public class RobotPesado extends SistemaArmas implements Volar, Atacar, Defender{

    public RobotPesado(Integer energia) {
        super(energia);
    }

    @Override
    public void atacar() {
        System.out.println("Atacar");
    }

    @Override
    public void defender() {

        System.out.println("Defender");
    }

    @Override
    public void volar() {

        System.out.println("Volar");
    }
}