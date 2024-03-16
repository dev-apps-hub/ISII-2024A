/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fi.disenio.patrones.estructural.bridge.faro;

/**
 *
 * @author jcs
 */
public class FaroLuzAmarilla implements IFaro{

    @Override
    public void encenderFaro() {
        System.out.println("proporcionar luz...");
    }

    @Override
    public void apagarFaro() {
        System.out.println("apagar luz...");
    }
    
}
