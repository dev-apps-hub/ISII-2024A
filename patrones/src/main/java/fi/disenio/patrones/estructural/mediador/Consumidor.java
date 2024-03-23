/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fi.disenio.patrones.estructural.mediador;

/**
 *
 * @author jcs
 */
public class Consumidor implements Runnable{
    private int id;
    private Mediador mediador;

    public Consumidor(int id, Mediador mediador) {
        this.id = id;
        this.mediador = mediador;
    }
    
    @Override
    public void run() {
        while(true){
            int num = mediador.getMsgs();
            System.out.println("c" + id + " get: " + num);
        }
        
    }
    
}
