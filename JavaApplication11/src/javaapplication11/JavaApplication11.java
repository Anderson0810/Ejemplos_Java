/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication11;

/**
 *
 * @author ANDY
 */
public class JavaApplication11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Crear un objeto de la clase Ruedas
        Ruedas ruedas = new Ruedas("");

        // Crear un objeto de la clase Propietario
        Propietario propietario = new Propietario("");

        // Crear un objeto de la clase Bicicleta con las ruedas y el propietario
        Bicicleta bicicleta = new Bicicleta(ruedas, propietario);

        // Mostrar los detalles de la bicicleta
        System.out.println("La bicicleta tiene ruedas de tipo: " + bicicleta.getRuedas().getTipoRuedas());
        System.out.println("El propietario de la bicicleta es: " + bicicleta.getPropietario().getNombre());
    
    }
    
}
