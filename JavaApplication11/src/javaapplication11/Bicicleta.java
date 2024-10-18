/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication11;

/**
 *
 * @author ANDY
 */
public class Bicicleta {
    private Ruedas ruedas;
    private Propietario propietario;

    // Constructor
    public Bicicleta(Ruedas ruedas, Propietario propietario) {
        this.ruedas = ruedas;
        this.propietario = propietario;
    }

    // Métodos getter y setter para ruedas
    public Ruedas getRuedas() {
        return ruedas;
    }

    public void setRuedas(Ruedas ruedas) {
        this.ruedas = ruedas;
    }

    // Métodos getter y setter para propietario
    public Propietario getPropietario() {
        return propietario;
    }

    public void setPropietario(Propietario propietario) {
        this.propietario = propietario;
    }
}
