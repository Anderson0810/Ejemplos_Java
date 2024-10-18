/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication7;

/**
 *
 * @author ANDY
 */
public class Cuerpo {
    private Corazon corazon;
    private Ropa ropa;

    // Constructor
    public Cuerpo(Corazon corazon, Ropa ropa) {
        this.corazon = corazon;
        this.ropa = ropa;
    }

    // Métodos getter y setter para Corazon
    public Corazon getCorazon() {
        return corazon;
    }

    public void setCorazon(Corazon corazon) {
        this.corazon = corazon;
    }

    // Métodos getter y setter para Ropa
    public Ropa getRopa() {
        return ropa;
    }

    public void setRopa(Ropa ropa) {
        this.ropa = ropa;
    }
}
