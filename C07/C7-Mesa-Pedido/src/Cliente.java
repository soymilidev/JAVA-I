public class Cliente {
    private String nombre;
    private int telefono;
    private String domicilio;

    public Cliente(String nombre, int telefono, String domicilio) {
        this.nombre = nombre;
        this.telefono = telefono;
        this.domicilio = domicilio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public String getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }

    public String toString() {
        return "CLIENTE" + "\n" +
                "nombre: " + nombre + "\n" +
                "telefono: " + telefono + "\n" +
                "domicilio: " + domicilio + "\n"
                ;
    }
}