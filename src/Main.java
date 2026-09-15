import Clases.User;
import Clases.Book;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        User usuario = new User();

        var libro1 = new Book(1 , "don quijote" , "novela", "Miguel de Cervantes", 13);
        var libro2 = new Book(2, "12 Nuevas reglas para vivir", "Autoayuda", "Jordan B. Peterson", 24);



        Book[] Libreria = {libro1,libro2};

        System.out.println("1-Inicio de sesion");
        System.out.println("2-Buscar libro");

        int opcion = teclado.nextInt();
        teclado.nextLine();
        switch (opcion) {
            case 1 -> {
                System.out.println("Inicio de Sesion");
                System.out.println("Ingrese su nombre de usuario");
                String nombreUsuario = teclado.nextLine();

                usuario.setName(nombreUsuario);

                System.out.println("Ingrese contraseña");
                String passwordUsuario = teclado.nextLine();

                usuario.setPassword(passwordUsuario);
            }
            case 2 -> {
                System.out.println("Ingrese el nombre del libro");

            }

        }
        System.out.println("el nombre del objeto usuario es:" + usuario.getName());

        teclado.close();
        }

    }


