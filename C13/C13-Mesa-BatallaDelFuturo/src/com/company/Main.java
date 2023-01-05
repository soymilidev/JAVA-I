package com.company;

public class Main {
    public static void main(String[] args) {
        System.out.println("-----------------------------------------");
        System.out.println("Robot Liviano");
        System.out.println("-----------------------------------------");
        RobotLiviano robotLiviano1 = new RobotLiviano(80);
        robotLiviano1.mostrar();
        robotLiviano1.atacar();
        robotLiviano1.defender();
        robotLiviano1.volar();

        System.out.println("-----------------------------------------");
        System.out.println("Robot Liviano");
        System.out.println("-----------------------------------------");
        RobotPesado robotPesado1 = new RobotPesado(100);
        robotPesado1.mostrar();
        robotPesado1.atacar();
        robotPesado1.defender();
        robotPesado1.volar();

        System.out.println("-----------------------------------------");
        System.out.println("Tanque");
        System.out.println("-----------------------------------------");
        Tanque tanque1 = new Tanque(60);
        tanque1.mostrar();
        tanque1.atacar();
        tanque1.defender();

        System.out.println("-----------------------------------------");
        System.out.println("Señuelo");
        System.out.println("-----------------------------------------");
        Tanque senuelo1 = new Tanque(80);
        senuelo1.mostrar();
    }
}