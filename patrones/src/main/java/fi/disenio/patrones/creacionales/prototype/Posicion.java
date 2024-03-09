/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fi.disenio.patrones.creacionales.prototype;

/**
 *
 * @author jcs
 */
public class Posicion implements Cloneable{
    private int x;
    private int y;
    
    

    public Posicion(int x, int y) {
        this.x = x;
        this.y = y;
    }
    
    public Posicion clonar() throws CloneNotSupportedException{
        return (Posicion)super.clone();
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    @Override
    public String toString() {
        return "Posicion{" + "x=" + x + ", y=" + y + '}';
    }
    
    
}
