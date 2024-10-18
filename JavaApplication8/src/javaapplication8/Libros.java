/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication8;

/**
 *
 * @author paginas
 */
public class Libros {
    private Paginas paginas;
    private Autor autor;

    // Constructor
    public Libros(Paginas paginas, Autor autor) {
        this.paginas = paginas;
        this.autor = autor;
    }

    // Métodos getter y setter para habitaciones
    public Paginas getPaginas() {
        return paginas;
    }

    public void setPaginas(Paginas paginas) {
        this.paginas = paginas;
    }

    // Métodos getter y setter para muebles
    public Autor getAutor() {
        return autor;
    }

    public void setAutor(Autor autor) {
        this.autor = autor;
    }
}
