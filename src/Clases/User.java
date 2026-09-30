package Clases;

import java.util.List;

public class User {
    private int id;
    private String nombre;
    private String email;
    private String password;
    private List<Book> librosPrestados;


    public User(int id, String nombre, String email, String password) {
        this.id = id;
        this.nombre = nombre;
        this.email = email;
        this.password = password;

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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public List<Book> getLibrosPrestados() {
        return librosPrestados;
    }

    public void setLibrosPrestados(List<Book> librosPrestados) {
        this.librosPrestados = librosPrestados;
    }


}