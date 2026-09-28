package Clases;

public class Book {
    private String titulo;
    private String autor;
    private Categoria categoria;



    public Book(String titulo, String autor, Categoria categoria) {
        this.titulo = titulo;
        this.autor = autor;
        this.categoria = categoria;
    }

    public String getTitulo() {
        return titulo;
    }



    public String getAutor() {
        return autor;
    }



    public Categoria getCategoria() {
        return categoria;
    }




}