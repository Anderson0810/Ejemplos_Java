/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication12;

/**
 *
 * @author ANDY
 */
public class Jardin {
    private Flores flores;
    private Decoracion decoracion;

    // Constructor
    public Jardin(Flores flores, Decoracion decoracion) {
        this.flores = flores;
        this.decoracion = decoracion;
    }

    // Métodos getter y setter
    public Flores getflores() {
        return flores;
    }

    public void setFlores(Flores flores) {
        this.flores = flores;
    }

    // Métodos getter y setter 
    public Decoracion getDecoracion() {
        return decoracion;
    }

    public void setDecoracion(Decoracion decoracion) {
        this.decoracion = decoracion;
    }

    Object getFlores() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
