

import Clases.Biblioteca;
import Clases.User;

import java.util.ArrayList;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {

        Biblioteca prueba = new Biblioteca();
        prueba.agregarCategoria(1,"lean","hola");
        prueba.agregarUsuario(1,"leandro","hola","messi");
        prueba.agregarLibro(1,"don quijote", "cervantes", 1873, "2514", "disponible");

        prueba.prestarLibro("don quijote", newUsuario );


    }
}
