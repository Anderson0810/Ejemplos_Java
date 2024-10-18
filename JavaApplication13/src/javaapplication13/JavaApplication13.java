/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication13;

/**
 *
 * @author ANDY
 */
public class JavaApplication13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Facultad facultad = new Facultad("Ingenieria");

        
        Tiendas tiendas = new Tiendas("Tambo");

        
        Universidad universidad = new Universidad(facultad, tiendas);

        // 
        System.out.println("Facultad: " + universidad.getFacultad().getTipo());
        System.out.println("Tiendas: " + universidad.getTiendas().getNombre());
    }
    
}
