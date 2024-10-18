/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication8;

/**
 *
 * @author ANDY
 */
public class JavaApplication8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Crear un autor
        Autor autor = new Autor("");

        // Crear las páginas
        Paginas paginas = new Paginas(417);

        // Crear un libro con el autor y las páginas
        Libros libro = new Libros(paginas, autor);

        // Mostrar los detalles del libro
        System.out.println("El autor del libro es: " + libro.getAutor().getNombre());
        System.out.println("El número de páginas del libro es: " + libro.getPaginas().getNumero());
    }   
}
