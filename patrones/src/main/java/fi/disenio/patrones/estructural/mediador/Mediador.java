/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fi.disenio.patrones.estructural.mediador;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author jcs
 */
public class Mediador {
    private boolean slotFull = false;
    private int num;
    
    public synchronized void storeMsgs(int num){
        while(slotFull){
            
            try {
                System.out.println("@ Productor en espera");
                wait();
            } catch (InterruptedException ex) {
                Logger.getLogger(Mediador.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        slotFull = true;
        this.num = num;
        notifyAll();
 
    }
    
    public synchronized int getMsgs(){
        while(!slotFull){
            
            try {
                System.out.println("@ Consumidor en espera");
                wait();
                
            } catch (InterruptedException ex) {
                Logger.getLogger(Mediador.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
        slotFull=false;
        notifyAll();
        return num;
    }
    
    
    
}
