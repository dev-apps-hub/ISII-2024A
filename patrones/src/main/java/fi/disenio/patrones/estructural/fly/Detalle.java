/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fi.disenio.patrones.estructural.fly;

/**
 *
 * @author jcs
 */
public class Detalle {
    private int ram;
    private int disco;
    private static int contador;

    public Detalle(int ram, int disco) {
        this.ram = ram;
        this.disco = disco;
        contador++;
        
        System.out.println("instancias detalle: " + contador);
    }
    
    

    public Detalle(int ram) {
        this.ram = ram;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public int getDisco() {
        return disco;
    }

    public void setDisco(int disco) {
        this.disco = disco;
    }

    @Override
    public String toString() {
        return "Detalle{" + "ram=" + ram + ", disco=" + disco + '}';
    }
    
    
    
    
}
