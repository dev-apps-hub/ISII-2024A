/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fi.disenio.patrones.estructural.fly;

/**
 *
 * @author jcs
 */
public class Cliente2 {
    
    static{
        for(int i=0; i<10; i++){
            //Detalle detalle = new Detalle(8, 200);
            //IComputadora lapWin = new Laptop("R12345"+i, detalle);
            IComputadora lapWin = ComputadoraFactory.crearComputadora("R12345"+i, 8, 200);
            System.out.println(lapWin);
        }
    }
    
    
}
