import Clases.User;
import Clases.Book;

import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);


        var libro1 = new Book(1 , "don quijote" , "novela", "Miguel de Cervantes", 13);
        var libro2 = new Book(2, "12 Nuevas reglas para vivir", "Autoayuda", "Jordan B. Peterson", 24);



        Book[] Libreria = {libro1,libro2};


        System.out.println("1-Buscar libro");

        int opcion = teclado.nextInt();
        teclado.nextLine();
        switch (opcion) {

            case 1 -> {
                System.out.println("Ingrese el nombre del libro");
                String nombreLibro = teclado.nextLine();
                boolean encontrado = false;

                for (Book buscar : Libreria) {
                    if(buscar.getNombre().equals(nombreLibro)) {
                        encontrado = true;
                        break;
                    }
                }
                if (encontrado){
                    System.out.println("Su libro se encuentra en la libreria");
                } else {
                    System.out.println("El libro que esta buscando no se encuentra");
                }

            }

        }

        teclado.close();
        }

    }



