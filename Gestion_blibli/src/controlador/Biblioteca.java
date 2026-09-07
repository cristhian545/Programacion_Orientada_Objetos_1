package controlador;
import Modelo.Libro;

import java.util.ArrayList;
import java.util.List;

public class Biblioteca {
    private List<Libro> listaLibros;



    public Biblioteca(){
        listaLibros = new ArrayList<>();

    }

    public Biblioteca(List<Libro> listaLibros) {
        this.listaLibros = listaLibros;
    }

    public List<Libro> getListaLibros() {
        return listaLibros;
    }

    public void setListaLibros(List<Libro> listaLibros) {
        this.listaLibros = listaLibros;
    }

    public void agregar(Libro libro){
        listaLibros.add(libro);
    }

    @Override
    public String toString() {
        return "Biblioteca{" +
                "listaLibros=" + listaLibros +
                '}';
    }

    public void listar(){
        System.out.println("******LIBROS******");
        for(Libro l : listaLibros);

    }
}
