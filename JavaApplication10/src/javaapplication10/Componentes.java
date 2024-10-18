/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication10;

/**
 *
 * @author ANDY
 */
public class Componentes {
    private String monitor;
    private String teclado;
    private String mouse;

    // Constructor
    public Componentes(String monitor, String teclado, String mouse) {
        this.monitor = monitor;
        this.teclado = teclado;
        this.mouse = mouse;
    }

    // Métodos getter y setter para monitor
    public String getMonitor() {
        return monitor;
    }

    public void setMonitor(String monitor) {
        this.monitor = monitor;
    }

    // Métodos getter y setter para teclado
    public String getTeclado() {
        return teclado;
    }

    public void setTeclado(String teclado) {
        this.teclado = teclado;
    }

    // Métodos getter y setter para mouse
    public String getMouse() {
        return mouse;
    }

    public void setMouse(String mouse) {
        this.mouse = mouse;
    }
}
