/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fi.disenio.patrones.estructural.facade;

//DAO

/**
 *
 * @author jcs
 */
public class Cliente {
    public static void main(String[] args) throws InterruptedException {
        Computadora lap = new Computadora();
        ArranqueComputadora facade = new ArranqueComputadora(lap);
        facade.iniciar();
        Thread.sleep(1000);
        facade.detener();
        
    }
}
