package Clases;

public class User {
    private int id;
    private String name;
    private String email;
    private int telefono;
    private String password;


    public User () {};

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        if (password.equals("pepito")) {
            this.password = password;
            System.out.println("Ha iniciado sesion");
        } else {
            System.out.println("Contraseña Incorrecta");
        }
    }
}
