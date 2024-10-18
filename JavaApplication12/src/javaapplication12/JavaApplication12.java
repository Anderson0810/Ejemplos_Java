/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication12;

/**
 *
 * @author ANDY
 */
public class JavaApplication12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Flores flores = new Flores("");

        // Crear un objeto de la clase 
        Decoracion decoracion = new Decoracion("");

        // Crear un objeto de la clase 
        Jardin jardin = new Jardin(flores, decoracion);

        // Mostrar los detalles de la bicicleta
        System.out.println("tipo de flores: " + jardin.getFlores());
        System.out.println("la decoracion es: " + jardin.getDecoracion().getNombre());
    }
    
}
