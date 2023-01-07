package com.company;

public class Pelota extends Producto{
    private double radio;

    public Pelota(double peso, double radio) {
        super(peso);
        this.radio = radio;
    }

    @Override
    public Double calcularEspacio() {
        double resultadoSinLimitar = (4/3) * Math.PI * Math.pow(radio, 3);
        String resultadoLimitado = String.format("%.5f", resultadoSinLimitar);
        //Solucionar la excepción y parsear la cadena. Paso de una cadena "4181,45982" (con coma) a un número de tipo double (con punto)
        String cadenaCorregida = resultadoLimitado.replace(",", ".");
        return Double.parseDouble(cadenaCorregida);
    }
}
