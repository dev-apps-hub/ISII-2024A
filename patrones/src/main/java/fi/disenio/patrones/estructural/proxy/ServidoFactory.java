/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fi.disenio.patrones.estructural.proxy;

/**
 *
 * @author jcs
 */
public class ServidoFactory {
    
    public static IServidor getServidorWebInstance(){
        IServidor servidorWeb = new ServidorWeb();
        return new ServidorProxy(servidorWeb);
    }
}
