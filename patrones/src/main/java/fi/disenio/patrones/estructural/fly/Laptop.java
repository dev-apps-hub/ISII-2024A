/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fi.disenio.patrones.estructural.fly;

/**
 *
 * @author jcs
 */
public class Laptop implements IComputadora{
    private String id;
    private Detalle detalle;

    public Laptop(String id, Detalle detalle) {
        this.id = id;
        this.detalle = detalle;
    }
    
    

    @Override
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    

    @Override
    public String toString() {
        return "Laptop{" + "id=" + id + ", detalle=" + detalle + '}';
    }

    @Override
    public int getRam() {
        return detalle.getRam();
    }

    @Override
    public int getDisco() {
        return detalle.getDisco();
    }

    
    
    
    
}
