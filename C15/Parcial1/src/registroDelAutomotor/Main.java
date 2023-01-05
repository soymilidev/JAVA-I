package registroDelAutomotor;

/*
-De cualquier vehículo poder saber si es industria nacional.

-En el caso de los camiones debe ser posible compararlos. Un camión es mayor a otro de
acuerdo a la capacidad de carga.

-Es importante contar con alguna funcionalidad en los autos para saber si un auto es
económico. Entendiendo que es económico si es a gas o una cilindrada menor a 1200 cc..
*/

public class Main {
    public static void main(String[] args) {
        Dueno dueno1 = new Dueno("Milagros", "Castro", "12051990");
        Automovil auto1 = new Automovil("17062022", 1000.00, "Fiat", "ABC 123", false, true, 1100);
        Automovil auto2 = new Automovil("18062022", 2000.00, "Suzuki", "ABC 321", true, false, 1500);

        Camion camion1 = new Camion("17062022",5000.00, "Volvo", "POO 999", true, 4, 2.00);
        Camion camion2 = new Camion("17062022",3000.00, "Nissan", "POO 100", false, 4, 1.00);

        //Verificar Industria Nacional:
        if(auto1.esIndustriaNacional())
            System.out.println("Es industria Nacional");
        else
            System.out.println("No es industria Nacional");

        //Comparar camiones:
        if(camion1.compareTo(camion2) == 1)
            System.out.println("El camion1 es mayor que el camion2");
        else if(camion1.compareTo(camion2) == -1)
            System.out.println("El camion2 es mayor que el camion1");
        else
            System.out.println("Los camiones son iguales");

        //Verificar si el auto es económico:
        if(auto1.esEconomico())
            System.out.println("Es económico");
        else
            System.out.println("No es económico");

        if(auto2.esEconomico())
            System.out.println("Es económico");
        else
            System.out.println("No es económico");

        };
    }