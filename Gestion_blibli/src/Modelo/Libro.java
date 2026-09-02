package Modelo;

public class Libro {

    private String titulo, autor, genero;
    private int anioPublicacion;

    public Libro() {
    }

    public Libro(String titulo, String autor, String genero, int anioPublicacion) {
        this.titulo = titulo;
        this.autor = autor;
        this.genero = genero;
        this.anioPublicacion = anioPublicacion;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public int getAnioPublicacion() {
        return anioPublicacion;
    }

    public void setAnioPublicacion(int anioPublicacion) {
        this.anioPublicacion = anioPublicacion;


    }

    public void mostrarinfo(){
        System.out.println("Titulo" + titulo);
        System.out.println("Autor" + autor);
        System.out.println("Genero" + genero);
        System.out.println("Año de publicacion" + anioPublicacion);
    }
}


