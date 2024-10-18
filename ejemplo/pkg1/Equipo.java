/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejemplo.pkg1;

/**
 *
 * @author ANDY
 */
public class Equipo {

    public Jugadores getJugadores() {
        return jugadores;
    }

    public void setJugadores(Jugadores jugadores) {
        this.jugadores = jugadores;
    }

    public Uniformes getUniformes() {
        return uniformes;
    }

    public void setUniformes(Uniformes uniformes) {
        this.uniformes = uniformes;
    }
    private Jugadores jugadores;
    private Uniformes uniformes;
    
    
    public Equipo(Jugadores jugadores){
        this.jugadores = jugadores;
    }
    
    public Equipo (Jugadores jugadores, Uniformes uniformes){
        this.uniformes = uniformes;
    }
            
}
