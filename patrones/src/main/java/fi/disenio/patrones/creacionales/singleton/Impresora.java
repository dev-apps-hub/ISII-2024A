/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fi.disenio.patrones.creacionales.singleton;

/**
 *
 * @author jcs
 */
public class Impresora {
    //private static Impresora instance = new Impresora();
    private static Impresora instance;
    
    private Impresora(){       
    }
    
    public synchronized static Impresora getInstance(){
        if(instance == null){
            System.out.println("@@ Primera invocacion...");
            instance = new Impresora();
        }
        return instance;
    }
    
    public void imprimir(String texto){
        System.out.println("@@@ Imprimiendo texto: " + texto);
        //.....
    }
    
}
