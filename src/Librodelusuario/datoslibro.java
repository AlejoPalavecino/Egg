/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Librodelusuario;

/**
 *
 * @author alejo
 */
public class datoslibro {
    
    private String titulo;
    private String isbn;
    private int pages;

    public datoslibro() {
    }

    public datoslibro(String titulo, String isbn, int pages) {
        this.titulo = titulo;
        this.isbn = isbn;
        this.pages = pages;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    @Override
    public String toString() {
        return "datoslibro{" + "titulo=" + titulo + ", isbn=" + isbn + ", pages=" + pages + '}';
    }
    
    

    
    
}
