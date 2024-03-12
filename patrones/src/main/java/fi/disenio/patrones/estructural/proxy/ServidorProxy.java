/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fi.disenio.patrones.estructural.proxy;

import java.util.*;

/**
 *
 * @author jcs
 */
public class ServidorProxy implements IServidor{
    private IServidor servidoWeb;
    private static List<String> listaNegra = Arrays.asList("juegos.com", "juegos1.com");
    
    

    public ServidorProxy(IServidor servidoWeb) {
        this.servidoWeb = servidoWeb;
    }
    
    @Override
    public void despacharPagina(String url) {
        if(listaNegra.contains(url)){
            System.out.println("Pagina "+ url + " no está permitida");
            return;
        }
        
        System.out.println("enviando peticion al servido web...");
        servidoWeb.despacharPagina(url);
        
    }
    
}
