/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication9;

/**
 *
 * @author ANDY
 */
public class JavaApplication9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        // Crear un objeto de la clase Motores
        Motores motores = new Motores("");

        // Crear un objeto de la clase Pasajeros
        Pasajeros pasajero = new Pasajeros("");

        // Crear un objeto de la clase Avion con los motores y el pasajero
        Avion avion = new Avion(motores, pasajero);

        // Mostrar los detalles del avión
        System.out.println("El avión tiene motores de tipo: " + avion.getMotores().getMotores());
        System.out.println("El pasajero en el avión es: " + avion.getPasajeros().getNombre());
    
    }
    
}
