/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fi.disenio.patrones.estructural.adapter;

/**
 *
 * @author jcs
 */
public class Cliente {
    public static void main(String[] args) {
        IConectorCA conectorCA = new ConectorCAImpl();
        IConectorUSB conectorUSB = new ConectorUSBImpl();
        AdaptadorCelular adaptadorCelular = new AdaptadorCelular(conectorCA);
        
        Celular celular = new Celular(conectorUSB);
        celular.cargarBateria();
        
        
        Celular celular2 = new Celular(adaptadorCelular);
        celular2.cargarBateria();
    }
}
