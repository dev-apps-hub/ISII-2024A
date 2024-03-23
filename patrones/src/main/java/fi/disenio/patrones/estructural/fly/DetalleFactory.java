/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fi.disenio.patrones.estructural.fly;

import java.util.*;

/**
 *
 * @author jcs
 */
public class DetalleFactory {
    public static Map<String, Detalle> cacheDetalle = new HashMap<>();
    
    public static Detalle getDetalle(int ram, int disco){
        String clave = ram+"-"+disco;
        
        if(!cacheDetalle.containsKey(clave)){
            Detalle detalle = new Detalle(ram, disco);
            cacheDetalle.put(clave, detalle);
        }
        
        return cacheDetalle.get(clave);
        
    }
    
}
