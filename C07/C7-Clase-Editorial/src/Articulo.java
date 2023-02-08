public class Articulo {
    private String titulo;
    private String tema;
    private String autor;
    private String fechaArticulo;

    public Articulo(String titulo, String tema, String autor, String fechaArticulo) {
        this.titulo = titulo;
        this.tema = tema;
        this.autor = autor;
        this.fechaArticulo = fechaArticulo;
    }

    public String toString() {
        return "\n\n" + "ARTICULO" + "\n" +
                "titulo: " + titulo + "\n" +
                "tema: " + tema + "\n" +
                "autor: " + autor + "\n" +
                "fechaArticulo: " + fechaArticulo + "\n"
                ;
    }
}
