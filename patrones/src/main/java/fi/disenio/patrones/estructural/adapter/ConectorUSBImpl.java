/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fi.disenio.patrones.estructural.adapter;

/**
 *
 * @author jcs
 */
public class ConectorUSBImpl implements IConectorUSB{

    @Override
    public int flujo12v() {
        System.out.println("generando flujo 12v");
        return 12;
    }
    
}
