/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fi.disenio.patrones.estructural.mediador;

/**
 *
 * @author jcs
 */
public class Productor implements Runnable{
    private int id;
    private Mediador mediador;

    public Productor(int id, Mediador medidor) {
        this.id = id;
        this.mediador = medidor;
    }

    @Override
    public void run() {
        int num;
        
        while(true){
            num = (int)(Math.random()*100);
            mediador.storeMsgs(num);
            
            System.out.println("p"+id + "- num: " + num);
        }
    }
    
    
    
}
