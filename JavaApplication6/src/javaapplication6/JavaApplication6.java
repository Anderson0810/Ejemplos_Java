/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication6;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ANDY
 */
public class JavaApplication6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Crear algunas habitaciones
        Habitaciones habitacion1 = new Habitaciones("Sala");
        Habitaciones habitacion2 = new Habitaciones("Dormitorio");
        Habitaciones habitacion3 = new Habitaciones("Cocina");

        List<Habitaciones> listaHabitaciones;
        listaHabitaciones = new ArrayList<>();
        listaHabitaciones.add(habitacion1);
        listaHabitaciones.add(habitacion2);
        listaHabitaciones.add(habitacion3);

        Muebles muebles = new Muebles("Muebles de Jardín");

        Casa miCasa = new Casa(listaHabitaciones, muebles);

        System.out.println("Habitaciones de la casa:");
        for (Habitaciones h : miCasa.getHabitaciones()) {
            System.out.println("- " + h.getTipo());
        }

        System.out.println("Muebles de la casa:");
        System.out.println("- " + miCasa.getMuebles().getTipoM());
    }
    
}
