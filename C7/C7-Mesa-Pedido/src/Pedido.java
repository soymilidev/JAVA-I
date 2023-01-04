import java.util.Arrays;
public class Pedido {
    private String fechaPedido;
    private String codigoPedido;
    private Item items[];
    private Cliente clientes;

    public Pedido(String fechaPedido, String codigoPedido, Cliente clientes) {
        this.fechaPedido = fechaPedido;
        this.codigoPedido = codigoPedido;
        this.items = items;
        this.clientes = clientes;
        items = new Item[8];
    }

    public String getFechaPedido() {
        return fechaPedido;
    }

    public void setFechaPedido(String fechaPedido) {
        this.fechaPedido = fechaPedido;
    }

    public String getCodigoPedido() {
        return codigoPedido;
    }

    public void setCodigoPedido(String codigoPedido) {
        this.codigoPedido = codigoPedido;
    }

    public Item[] getItems() {
        return items;
    }

    public void setItems(Item[] items) {
        this.items = items;
    }

    public Cliente getClientes() {
        return clientes;
    }

    public void setClientes(Cliente clientes) {
        this.clientes = clientes;
    }

    int OrdenDelPedido =1;
    public void agregarItem(String nombre, Double precio){
        Item nuevoItem = new Item(nombre, precio);
        this.items[OrdenDelPedido] = nuevoItem;
        OrdenDelPedido++;
    }

    public String toString() {
        return "PEDIDO" + "\n" +
                "fechaPedido: " + fechaPedido + "\n" +
                "codigoPedido: " + codigoPedido + "\n" +
                "items: " + Arrays.toString(items) + "\n" +
                "ordenPosision: " + OrdenDelPedido + "\n"
                /*+"clientes: " + clientes + "\n"*/
                ;
    }
}