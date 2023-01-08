package org.example;

public class HabilidadFactory {
    private static HabilidadFactory instance;
    public static final String SIMPLE = "Simple";
    public static final String COMBINADA = "Combinada";

    private HabilidadFactory(){
    }

    public static HabilidadFactory getInstance() {
        if(instance==null) {
            instance = new HabilidadFactory();
        }
        return instance;
    }

    public Habilidad crearHabilidad(String codigo){
        switch (codigo){
            case SIMPLE:
                return new Simple();
            case COMBINADA:
                return new Combinada();
        }
        return null;
    }

}