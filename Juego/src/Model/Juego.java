package Model;

public class Juego {
    private int id;
    private String nombre;
    private String genero;
    private int precio;


    // Constructor vacio
    public Juego() {
    }

    // Getters y Setters
    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getGenero() {
        return genero;
    }

    public int getPrecio() {
        return precio;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    //toString
    @Override
    public String toString() {
        return "Juego{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", genero='" + genero + '\'' +
                ", precio=" + precio +
                '}';
    }

    //Constructor con parametros
    public Juego(int id, String nombre, String genero, int precio) {
        this.id = id;
        this.nombre = nombre;
        this.genero = genero;
        this.precio = precio;



        System.out.println();
    }

    public int calcularCantidad ( int cant){
        int valor;
        valor = this.precio * cant;
        return valor;
    }
}
