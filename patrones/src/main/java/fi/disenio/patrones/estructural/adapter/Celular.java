/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fi.disenio.patrones.estructural.adapter;

/**
 *
 * @author jcs
 */
public class Celular {
    private IConectorUSB conectorUSB;

    public Celular(IConectorUSB conectorUSB) {
        this.conectorUSB = conectorUSB;
    }
    
    public void cargarBateria(){
        int flujo12v = conectorUSB.flujo12v();
        
        System.out.println("caragando bateria: " + flujo12v + "v");
    }

    public IConectorUSB getConectorUSB() {
        return conectorUSB;
    }

    public void setConectorUSB(IConectorUSB conectorUSB) {
        this.conectorUSB = conectorUSB;
    }
    
    
    
}
