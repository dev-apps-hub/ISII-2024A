/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fi.disenio.patrones.creacionales.prototype;

/**
 *
 * @author jcs
 */
public class Circulo extends Figura{
    private int radio;

    public Circulo(int radio, Posicion posicion) {
        super(posicion);
        this.radio = radio;
    }
    
    

    @Override
    public Figura clonar() throws CloneNotSupportedException{
        Circulo clon =  (Circulo)super.clone();
        clon.setPosicion(this.getPosicion().clonar());
        
        return clon;
    }

    public int getRadio() {
        return radio;
    }

    public void setRadio(int radio) {
        this.radio = radio;
    }

    
    @Override
    public String toString() {
        return "Circulo{" + "radio=" + radio + " posicion= " + getPosicion() + '}';
    }
    
    
    
    
}
