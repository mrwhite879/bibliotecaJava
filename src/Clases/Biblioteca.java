package Clases;

import java.util.ArrayList;
import java.util.List;

public class Biblioteca {
    private List<Book> libros;
    private List<Categoria> categorias;
    private List<User> usuarios;

    public Biblioteca() {
        this.libros = new ArrayList<>();
        this.categorias = new ArrayList<>();
        this.usuarios = new ArrayList<>();
    }


    public List<Book> getLibros() {
        return libros;
    }


    public List<Categoria> getCategorias() {
        return categorias;
    }


    public List<User> getUsuarios() {
        return usuarios;
    }

    public List<Book> buscarPorNombre(String nombre) {
        List<Book> resultado = new ArrayList<>();

        if (libros.contains(nombre)) {

            System.out.println("EL nombre esta en la lista");
        }
        return resultado;
    }
}
