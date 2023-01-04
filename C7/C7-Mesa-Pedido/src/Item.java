public class Item {
    private String nombre;
    private Double precio;

    public Item(String nombre, Double precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    public String toString() {
        return "ITEM" + "\n" +
                "nombre: " + nombre + "\n" +
                "precio: " + precio + "\n"
                ;
    }
}