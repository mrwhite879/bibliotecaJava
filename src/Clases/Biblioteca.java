package Clases;

import java.util.ArrayList;
import java.util.List;
/*
la clase biblioteca no tiene atributos mas que estos porque solo necesita almacenar las listas de
libros que contiene
usuarios que usan la biblioteca
y categorias que dispone
todo esto va a ser del tipo arraylist
para poder almacenar varios

 */
public class Biblioteca {
    private List<Book> libros;
    private List<Categoria> categorias;
    private List<User> usuarios;
/*
creamos el constructor para que se inicializen y que podamos usarlos para guardar los datos correctamente
usando el this


 */
    public Biblioteca() {
        this.libros = new ArrayList<>();
        this.categorias = new ArrayList<>();
        this.usuarios = new ArrayList<>();
    }

/*
usamos los getters de cada una de las listas, son del tipo listas, donde los getters sirven para llamar
a esos atributos de la clase book
 */
    public List<Book> getLibros() {
        return libros;
    }


    public List<Categoria> getCategorias() {
        return categorias;
    }


    public List<User> getUsuarios() {
        return usuarios;
    }

    /*
    creamos una funcion del tipo arralist de la clase book, osea eso es lo que devuelve y nose porque deberia ser como boolean si se encontro o no xd
    le pasamos el nombre del tipo String, que se quiere buscar
    creamos un objeto del tipo arraylist, llamado resultado para buscar en la lista de libros guardados
    esto deberia ir como parametro, osea el nombre de la lista y el libro que se busca, ademas si ya tenemos una lista creada
    porque creamos otro objeto de la clase list<book>
    bueno luego usamos la condicional para usar la lista de libros real por asi decirlo y el metodo contains para saber si alguno de los objetos contiene el nombre del libro que estamos
    buscando, pero que es en realidad lo que hace contains? porque en el array de libros hay objetos y el nombre es String
    buscara en cada atributo del tipo string de cada uno de los objetos? tal vez seria lento
    bueno y si lo encuentra se muestra un texto y luego se retorna el resultado, se retorna el array que creamos antes. wtf
    tendria que ser un boolean o un string de exito o fracaso en la busqueda
     */

    /*
    explicacion 2:
    ahora se porque creamos un metodo del tipo lista, para devolver todas las coincidencias que haya
    dentro del metodo creamos el el objeto resultado del tipo de clase lista que va a contener objetos del tipo de clase book
    y va  aser un arraylist

    luego recorremos la lista de libros usando un for each moderno, donde creamos un tipo de objeto book, llamado libro
    y vamos a usar un condicional para obtener el titulo de cada uno de los libros y compararlo con el nombre del que estamos buscando, osea la
    variable del tipo String que se le paso al metodo por parametro
    si lo encuentra devuelve el arraylist de resultado
    sino resonde un msj de que no se encuentra aunque ahi tambien deberia devolver la lista no?
    hay metodos que puedan devolver mas de un dato?
    list es un tipo de dato y arraylist el tipo de estructura
     */

    /*
    explicacion 3: osea que el resultado que cree, es del tipo list, de estructura arraylist
    donde con un for en los parametros del for se crea un objeto del tipo Book llamado libro para
    obtener cada uno de los titulos para compararlos, no se puede usar libros porque es una lista
    como resultado es una lista puedo usar el .add para agregar el libro a esa lista, y el return si va adentro
    del if, a la primera que encuentra la coincidencia termina el metodo, si lo pongo afuera del for
    devuelve todas las coincidencias
     */
    public List<Book> buscarPorNombre(String nombre) {
        List<Book> resultado = new ArrayList<>();

        for (Book libro : libros) {

            if(libro.getTitulo().equals(nombre)){
                resultado.add(libro);
                System.out.println("El libro se encuentra en la biblioteca");

            } else {
                System.out.println("El libro no se encuentra");
            }
        }
        return resultado;

    }
    /*
    creamos el metodo o funcion, porque no devuelve nada, el metodo no devuelve nada y la funcion puede o no devolver
    esta es para agregar la categoria donde los parametros son id, nombre y descripcion para crearla luego reando un objeto del tipo de clase categoria
    pasandole los valores de las variables que recibio como argumento
    se añade a la lista de categorias y se muestra un texto, pero me hace ruido de que se tenga que poner un id manualmente, debe haber una forma automatica
    y porque use this aca? podriua usar solo el nombre de las lista mas add
     */
    public void agregarCategoria (int id, String nombre, String descripcion) {
        Categoria newCategoria = new Categoria(id, nombre, descripcion);
        this.categorias.add(newCategoria);
        System.out.println("categoria cargada");
    }
    /*
    aca la logica es la misma que arriba, pero en esta funcion devuelve un objeto del tipo de clase User
    y se retorna el objeto nuevo a donde se llamo
     */
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
