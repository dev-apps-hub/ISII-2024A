/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fi.disenio.patrones.estructural.adapter;

/**
 *
 * @author jcs
 */
public class AdaptadorCelular implements IConectorUSB{
    private IConectorCA conectorCA;

    public AdaptadorCelular(IConectorCA conectorCA) {
        this.conectorCA = conectorCA;
    }

    @Override
    public int flujo12v() {
        int flujo120v = conectorCA.flujo120V();
        int flujo12v = flujo120v/10;
        System.out.println("@@@ adaptando voltaje de " + flujo120v + " a " + flujo12v);
        return flujo12v;
    }

    public IConectorCA getConectorCA() {
        return conectorCA;
    }

    public void setConectorCA(IConectorCA conectorCA) {
        this.conectorCA = conectorCA;
    }
    
    
}
