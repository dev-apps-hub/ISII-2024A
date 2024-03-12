/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fi.disenio.patrones.estructural.proxy;

/**
 *
 * @author jcs
 */
public class ServidorWeb implements IServidor{

    @Override
    public void despacharPagina(String url) {
        System.out.println("Contenido de pagina " + url);
    }
    
}
