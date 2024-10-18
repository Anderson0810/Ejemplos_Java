/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication10;

/**
 *
 * @author ANDY
 */
public class Computadora {
    private Cpu cpu;
    private Componentes componentes;

    // Constructor
    public Computadora(Cpu cpu, Componentes componentes) {
        this.cpu = cpu;
        this.componentes = componentes;
    }

    // Métodos getter y setter para cpu
    public Cpu getCpu() {
        return cpu;
    }

    public void setCpu(Cpu cpu) {
        this.cpu = cpu;
    }

    // Métodos getter y setter para componentes
    public Componentes getComponentes() {
        return componentes;
    }

    public void setComponentes(Componentes componentes) {
        this.componentes = componentes;
    }
}
