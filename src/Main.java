import Clases.User;
import Clases.Book;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        User usuario = new User();
        Book libro = new Book();

        System.out.println("1-Crear usuario");
        System.out.println("2-Buscar libro");

        int opcion = teclado.nextInt();
        teclado.nextLine();
        switch (opcion) {
            case 1 -> {
                System.out.println("Ingrese nombre de usuario");
                String lect = teclado.nextLine();

                usuario.name = lect;
            }
            case 2 -> {
                System.out.println("Ingrese nombre del libro");
                String nombreLibro = teclado.nextLine();

                libro.nombre = nombreLibro;

            }

        }
        System.out.println("el nombre del objeto usuario es:" + usuario.name);
        teclado.close();
        }

    }

    // 1- pedirle al usuario los datos que quiero que ingrese
    // 2- leer los datos
    // 3- guardarlo en la clase
