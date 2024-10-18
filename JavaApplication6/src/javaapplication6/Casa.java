/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication6;

import java.util.List;

/**
 *
 * @author ANDY
 */
public class Casa {
    private List<Habitaciones> habitaciones;
    private Muebles muebles;

    // Constructor
    public Casa(List<Habitaciones> habitaciones, Muebles muebles) {
        this.habitaciones = habitaciones;
        this.muebles = muebles;
    }

    // Métodos getter y setter para habitaciones
    public List<Habitaciones> getHabitaciones() {
        return habitaciones;
    }

    public void setHabitaciones(List<Habitaciones> habitaciones) {
        this.habitaciones = habitaciones;
    }

    // Métodos getter y setter para muebles
    public Muebles getMuebles() {
        return muebles;
    }

    public void setMuebles(Muebles muebles) {
        this.muebles = muebles;
    }

    
}
