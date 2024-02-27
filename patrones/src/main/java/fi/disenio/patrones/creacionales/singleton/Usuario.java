/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fi.disenio.patrones.creacionales.singleton;

/**
 *
 * @author jcs
 */
public class Usuario {
    
    public void enviarImpresion(String texto){
        Impresora impresora = Impresora.getInstance();
        impresora.imprimir(texto);
    }
}
