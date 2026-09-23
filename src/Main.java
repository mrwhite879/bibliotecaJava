import Clases.User;
import Clases.Book;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        int opcion = 0;

        List<Book> lista = new ArrayList<Book>();



        while (true) {
            System.out.println("Elija una opcion");
            System.out.println("1-Buscar libro");
            System.out.println("2-Listar los libros");
            System.out.println("3-Agregar libro");
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
                    for (Book book : lista) {
                        String libroActual = book.getNombre();
                        String textoBusqueda = busqueda;
                        boolean encontrado = libroActual.toLowerCase().contains(textoBusqueda.toLowerCase());
                        if (encontrado) {
                            System.out.println("Libro encontrado "+ book.getNombre() + " de " + book.getAutor());

                        }
                    }

                }

                case 2 -> {
                    for (Book book : lista) {
                        System.out.println(book.getInfo());
                    }
                }

                case 3 -> {
                    System.out.println("Ingrese el nombre del libro");
                    String nombre = teclado.nextLine();

                    System.out.println("Ingrese la categoria del libro");
                    String categoria = teclado.nextLine();

                    System.out.println("Ingrese el nombre del autor");
                    String autor = teclado.nextLine();

                    System.out.println("Ingrese la cantidad de ejemplares");
                    int cant = teclado.nextInt();

                    lista.add(new Book(1,nombre,categoria,autor,cant));

                    for (int i=0; i<lista.size(); i++) {
                        System.out.println("prueba:" + lista.get(i).getNombre());
                    }
                }
            }
            break;

        }




        }

    }
