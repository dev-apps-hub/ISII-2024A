/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fi.disenio.patrones.creacionales.prototype;

/**
 *
 * @author jcs
 */
public abstract class Figura implements Cloneable {
    private Posicion posicion;

    public Figura(Posicion posicion) {
        this.posicion = posicion;
    }
    
    public abstract Figura clonar() throws CloneNotSupportedException;

    public Posicion getPosicion() {
        return posicion;
    }

    public void setPosicion(Posicion posicion) {
        this.posicion = posicion;
    }
    
    
}
