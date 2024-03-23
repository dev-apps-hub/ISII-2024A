/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fi.disenio.patrones.estructural.mediador;

import java.util.*;

/**
 *
 * @author jcs
 */
public class Cliente {
    public static void main(String[] args) {
        List<Thread> colegas = new ArrayList<>();
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Press ENTER to exit");
        
        Mediador mediador = new Mediador();
        
        colegas.add(new Thread(new Productor(1,mediador)));
        colegas.add(new Thread(new Productor(2,mediador)));
        
        colegas.add(new Thread(new Consumidor(1,mediador)));
        colegas.add(new Thread(new Consumidor(2,mediador)));
        colegas.add(new Thread(new Consumidor(3,mediador)));
        
        for(Thread p : colegas){
            p.start();
        }
        
        boolean stop = false;
        String exit = scanner.nextLine();
        while(!stop){
            if(exit.equals("")){
                stop = true;
                for(Thread pThread: colegas){
                    pThread.stop();
                }
            }
        }
        
    }
}
