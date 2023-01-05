package com.company;

public class Tanque extends  SistemaArmas implements Atacar, Defender{

    public Tanque(Integer energia) {
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
}
