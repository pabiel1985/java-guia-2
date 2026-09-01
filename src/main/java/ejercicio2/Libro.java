package ejercicio2;

public class Libro {
    private String titulo;
    private double precio;
    private int stock;
    private Autor autor;

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public Autor getAutor() {
        return autor;
    }

    public void setAutor(Autor autor) {
        this.autor = autor;
    }

    public Libro(String titulo, double precio, int stock, Autor autor) {
        this.titulo = titulo;
        this.precio = precio;
        this.stock = stock;
        this.autor = autor;
    }

    @Override
    public String toString() {
        return "ejer2.Libro\n"+
                "titulo: " + titulo + "\n" +
                "precio: " + precio + "\n" +
                "stock: " + stock + "\n" +
                "autor: " + autor;
    }
    public void mostrarInfo(){
        System.out.println("El libro " + titulo + " de " + autor.getNombre()+ " " + autor.getApellido() + ". se vende al precio de " + precio + " pesos.");
    }
}