/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fi.disenio.patrones.estructural.fly;

/**
 *
 * @author jcs
 */
public class ComputadoraFactory {
    
    public static IComputadora crearComputadora(String idString, int ram, int disco){
        Detalle detalle = DetalleFactory.getDetalle(ram, disco);
        return new Laptop(idString, detalle);
    }
}
