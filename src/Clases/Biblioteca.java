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

    public void agregarCategoria (int id, String nombre, String descripcion) {
        Categoria newCategoria = new Categoria(id, nombre, descripcion);
        this.categorias.add(newCategoria);
        System.out.println("categoria cargada");
    }

    public User agregarUsuario (int id, String nombre, String email, String password) {
        User newUsuario = new User (id, nombre, email, password);
        usuarios.add(newUsuario);
        System.out.println("Usuario cargado");
        return newUsuario;
    }




    /*
    lo que va a hacer esto es prestarle el libro al usuario
    se crea un metodo llamado prestar libro, donde se le pasan los argumentos que en este caso seria
    una variable del libro requerido y la lista de libros disponibles, luego
    se usa un for para recorrer cada uno de los objetos del array libros,
    y con un if se consulta si el librorequerido coincide con alguno de los que esta en el array, si es cierto
    se usa otro if para saber si el estado, osea si esta disponible, si es cierto se muestra un msj de que si
    y se presta el libro, con el metodo prestar libro, osea se llama a si mismo este metodo y luego se quita en la lista de libros
    aunque no se deberia quitar sino cambiar su estado a prestado o no disponible
    despues con un metodo de la clase user, se le pasa como argumento al libro requerido para que el usuario tenga una lista de los libros que tomo prestados


    */

    public boolean prestarLibro (String libroRequerido, User usuario   ) {
        for (int i=0; i<libros.size(); i++){
            Book libro = libros.get(i);

            if (libro.getTitulo().equals(libroRequerido)) {
                if (libro.getEstado() == true) {
                    System.out.println("El libro esta disponible");
                    libro.setEstado(false);


                    usuario.getLibrosPrestados().add(libro);

                    return true;
                } else {
                    System.out.println("El libro no esta disponible");
                    return false;
                }
            }
        }
        System.out.println("El libro no existe");
        return false;
    }

}
