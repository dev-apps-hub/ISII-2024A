/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fi.disenio.patrones.creacionales.singleton;

/**
 *
 * @author jcs
 */
public class TestImpresora {
    public static void main(String[] args) {
        Usuario juan = new Usuario();
        juan.enviarImpresion("Patrones de diseño..");
        
        Usuario maria = new Usuario();
        maria.enviarImpresion("Base de datos..");
        
        //Impresora imp = Impresora.getInstance(); //new Impresora();
    }
}
