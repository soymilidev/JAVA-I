public class Main {
    public static void main(String[] args) {
        Cliente cliente1 = new Cliente("Juan Perez", 12345678, "Avenida Siempreviva 742, Evergreen Terrace");
        Pedido pedido1 = new Pedido("01-01-2022","0101", cliente1);
        Item articulo1 = new Item("pizza",850.0);
        Item articulo2 = new Item("docenaEmpanadas", 1800.0);
        System.out.println(cliente1.toString());
        System.out.println(pedido1.toString());
        System.out.println(articulo1.toString());
        System.out.println(articulo2.toString());
    }
}