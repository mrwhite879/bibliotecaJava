package Clases;

public class Book {
    private int id;
    private String titulo;
    private String autor;
    private int anioPublicacion;
    private String isbn;
    private Categoria categoria;
    private Boolean estado;
    public User usuarioPrestado;


    public Book(Categoria categoria, int id, String titulo, String autor, int anioPublicacion, String isbn, String estado) {
        this.categoria = categoria;
        this.id = id;
        this.titulo = titulo;
        this.autor = autor;
        this.anioPublicacion = anioPublicacion;
        this.isbn = isbn;
        this.estado = estado;

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getAnioPublicacion() {
        return anioPublicacion;
    }

    public void setAnioPublicacion(int anioPublicacion) {
        this.anioPublicacion = anioPublicacion;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    public Boolean getEstado() {
        return estado;
    }

    public void setEstado(Boolean estado) {
        this.estado = estado;
    }

    public User getUsuarioPrestado() {
        return usuarioPrestado;
    }

    public void setUsuarioPrestado(User usuarioPrestado) {
        this.usuarioPrestado = usuarioPrestado;
    }


}