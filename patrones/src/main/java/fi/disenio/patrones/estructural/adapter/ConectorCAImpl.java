/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fi.disenio.patrones.estructural.adapter;

/**
 *
 * @author jcs
 */
public class ConectorCAImpl implements IConectorCA{

    @Override
    public int flujo120V() {
        System.out.println("generando flijo de 120V");
        return 120;
    }
    
}
