import Clases.Book;
import java.util.ArrayList;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        ArrayList<Book> libros = new ArrayList<Book>();
        Book gestor = new Book();

        Scanner teclado = new Scanner(System.in);

        int opcion;
        System.out.println("1 para cargar. 2 para mostrar");

        opcion = teclado.nextInt();
        switch (opcion) {
            case 1 -> gestor.cargarLibro(libros);


            case 2 -> gestor.mostrarLibros(libros);

        }

    }
}

// el bucle al presionar el numero para salir, no sale
//los libros no se estan cargando en el arraylist
//nose que funcion cumple el crear un objeto de la clase Book?