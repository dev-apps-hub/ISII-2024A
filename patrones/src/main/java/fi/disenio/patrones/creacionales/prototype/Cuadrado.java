/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fi.disenio.patrones.creacionales.prototype;

import java.util.stream.DoubleStream;

/**
 *
 * @author jcs
 */
public class Cuadrado extends Figura{
    private int lado;

    public Cuadrado(int lado, Posicion posicion) {
        super(posicion);
        this.lado = lado;
    }
    
    

    @Override
    public Figura clonar() throws CloneNotSupportedException{
        Cuadrado clon = (Cuadrado)super.clone();
        clon.setPosicion(this.getPosicion().clonar());
        
        return clon;
    }

    public int getLado() {
        return lado;
    }

    public void setLado(int lado) {
        this.lado = lado;
    }

    @Override
    public String toString() {
        return "Cuadrado{" + "lado=" + lado + " posicion= " + getPosicion() + '}';
    }
    
    
}
