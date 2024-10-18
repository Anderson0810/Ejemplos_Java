/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication7;

/**
 *
 * @author ANDY
 */
public class JavaApplication7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Crear un corazón
        Corazon corazon = new Corazon();

        // Crear una ropa
        Ropa ropa = new Ropa("Camisa");

        // Crear un cuerpo con el corazón y la ropa
        Cuerpo cuerpo = new Cuerpo(corazon, ropa);

        // Hacer latir el corazón
        cuerpo.getCorazon().Latir();

        // Mostrar la ropa
        System.out.println("El cuerpo está usando: " + cuerpo.getRopa().getTipo());
    }
    
}
