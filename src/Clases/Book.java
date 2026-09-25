package Clases;
import java.util.ArrayList;
import java.util.Scanner;

public class Book {
    private int id;
    private String nombre;
    private String categoria;
    private String autor;
    private int cant_ejemplares;

    public Book() { };

    public Book(int id, String nombre, String categoria, String autor, int cant_ejemplares) {
        this.id = id;
        this.nombre = nombre;
        this.categoria = categoria;
        this.autor = autor;
        this.cant_ejemplares = cant_ejemplares;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getCant_ejemplares() {
        return cant_ejemplares;
    }

    public void setCant_ejemplares(int cant_ejemplares) {
        this.cant_ejemplares = cant_ejemplares;
    }

    public String getInfo() {
        return "Libro: "+ nombre + " autor: "+ autor;
    }

    public void cargarLibro (ArrayList<Book> libros){

        Scanner teclado = new Scanner(System.in);
        String nombre;
        String categoria;
        String autor;
        int id;
        int cant_ejem;

        int opcion;


        for (int i= 1; i<5; i++) {

            do {
                System.out.println("id?");
                id= teclado.nextInt();
                teclado.nextLine();
                System.out.println("Ingrese el nombre del libro");
                nombre = teclado.nextLine();

                System.out.println("Categoria");
                categoria = teclado.nextLine();

                System.out.println("Ingrese el nombre del autor");
                autor = teclado.nextLine();


                System.out.println("Ingrese la cantidad de ejemplares");
                cant_ejem = teclado.nextInt();



                libros.add(new Book(id,nombre,categoria, autor, cant_ejem));


                System.out.println("Presione 1 para seguir ingresando empleados");
                System.out.println("Presione 2 para salir");
                opcion = teclado.nextInt();

            } while (opcion == 1);


        }


    }
}
