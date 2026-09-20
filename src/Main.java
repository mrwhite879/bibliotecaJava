import Clases.User;
import Clases.Book;

import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        int opcion = 0;

        var libro1 = new Book(1 , "don quijote" , "novela", "Miguel de Cervantes", 13);
        var libro2 = new Book(2, "12 Nuevas reglas para vivir", "Autoayuda", "Jordan B. Peterson", 24);



        Book[] Libreria = {libro1, libro2};


        while (true) {
            System.out.println("Elija una opcion");
            System.out.println("1-Buscar libro");
            System.out.println("2-Salir");
            if (teclado.hasNextInt()) {
                opcion = teclado.nextInt();

                if (opcion >= 1 && opcion <=5){
                    System.out.println("Numero valido");
                } else {
                    System.out.println("Solo puede ingresar números del 1 al 5.");
                }

            } else {

                System.out.println("Tipo de dato invalido.");

            }

            teclado.nextLine();
            switch (opcion) {

                case 1 -> {
                    System.out.println("Ingrese el nombre del libro");
                    String busqueda = teclado.nextLine();
                    System.out.println(busqueda);
                    for (Book book : Libreria) {
                        String libroActual = book.getNombre();
                        String textoBusqueda = busqueda;
                        boolean encontrado = libroActual.toLowerCase().contains(textoBusqueda.toLowerCase());
                        if (encontrado) {
                            System.out.println("Libro encontrado "+ book.getNombre() + " de " + book.getAutor());

                        }
                    }

                }

                case 2 -> {
                    System.out.println("Saliendo del programa...");
                }
            }
            break;

        }




        }

    }
//pseudocodigo:
// comparar si alguna de las palabras o palabra que ingreso el usuario coincide con lo que hay guardado en el array
//