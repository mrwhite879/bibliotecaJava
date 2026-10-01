

import Clases.Biblioteca;
import Clases.User;

import java.util.ArrayList;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {

        Biblioteca prueba = new Biblioteca();

        User referenciaNewUsuario = prueba.agregarUsuario(1,"leandro","hola","messi");

        prueba.prestarLibro("don quijote", referenciaNewUsuario);



    }
}
