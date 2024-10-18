/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication10;

/**
 *
 * @author ANDY
 */
public class JavaApplication10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Crear un objeto de la clase Cpu
        Cpu cpu = new Cpu("Intel Core i7");

        // Crear un objeto de la clase Componentes
        Componentes componentes = new Componentes("Dell 24 inch", "Logitech G Pro", "Razer DeathAdder");

        // Crear un objeto de la clase Computadora con la cpu y los componentes
        Computadora computadora = new Computadora(cpu, componentes);

        // Mostrar los detalles de la computadora
        System.out.println("La computadora tiene la CPU: " + computadora.getCpu().getCaracteristicas());
        System.out.println("El monitor de la computadora es: " + computadora.getComponentes().getMonitor());
        System.out.println("El teclado de la computadora es: " + computadora.getComponentes().getTeclado());
        System.out.println("El mouse de la computadora es: " + computadora.getComponentes().getMouse());
    
    }
    
}
