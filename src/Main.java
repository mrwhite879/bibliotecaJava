

import Clases.Biblioteca;
import Clases.User;
import Clases.Book;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {


        Biblioteca prueba = new Biblioteca();
        List<Book> resultados =  prueba.buscarPorNombre("don quijote");
        System.out.println(prueba.getLibros());



    }
}
