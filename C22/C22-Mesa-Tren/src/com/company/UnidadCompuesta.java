package com.company;

import java.util.ArrayList;
import java.util.List;

public class UnidadCompuesta implements FiguraGeometrica {
    private List<FiguraGeometrica> figurasGeometricas;

    public UnidadCompuesta() {
        figurasGeometricas = new ArrayList<>();
    }

    public void agregarFiguraGeometrica(FiguraGeometrica figuraGeometrica){
        figurasGeometricas.add(figuraGeometrica);
    }


    @Override
    public String mostrar() {
        String texto = "";
        for (FiguraGeometrica f: figurasGeometricas) {
            texto += f.mostrar() + "\n";
        }
        return texto;
    }

    @Override
    public double calcularArea() {
        double total = 0;
        for (FiguraGeometrica f: figurasGeometricas) {
            total += f.calcularArea();
        }
        return total;
    }

}