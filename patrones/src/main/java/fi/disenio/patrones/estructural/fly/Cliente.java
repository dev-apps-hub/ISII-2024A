/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fi.disenio.patrones.estructural.fly;

/**
 *
 * @author jcs
 */
public class Cliente {
    public static void main(String[] args) {
        //Detalle detalle = new Detalle(8, 200);
        //IComputadora lap = new Laptop("S234234324", detalle);
        IComputadora lap = ComputadoraFactory.crearComputadora("S234234324", 8, 200);        
        System.out.println(lap);
        
        //Detalle detalle2 = new Detalle(16, 500);
        //IComputadora lap2 = new Laptop("Q12345", detalle2);
        IComputadora lap2 = ComputadoraFactory.crearComputadora("Q12345", 16, 500);
        System.out.println(lap2);
        
        //IComputadora lap3 = new Laptop("ABC", detalle);
        IComputadora lap3 = ComputadoraFactory.crearComputadora("ABC", 8, 200);
        System.out.println(lap3);
        
        
        Cliente2 cliente2 = new Cliente2();
    }
}
