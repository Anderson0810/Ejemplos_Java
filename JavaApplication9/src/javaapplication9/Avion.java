/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication9;

/**
 *
 * @author ANDY
 */
public class Avion {
    private Motores motores;
    private Pasajeros pasajeros;

    // Constructor
    public Avion(Motores motores, Pasajeros pasajeros) {
        this.motores = motores;
        this.pasajeros = pasajeros;
    }

    // Métodos getter y setter para motores
    public Motores getMotores() {
        return motores;
    }

    public void setMotores(Motores motores) {
        this.motores = motores;
    }

    // Métodos getter y setter para pasajeros
    public Pasajeros getPasajeros() {
        return pasajeros;
    }

    public void setPasajeros(Pasajeros pasajeros) {
        this.pasajeros = pasajeros;
    }
}
