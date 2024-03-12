/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fi.disenio.patrones.estructural.decorator;

/**
 *
 * @author jcs
 */
public class DecoradorTexto extends Decorador{
    private String texto;

    public DecoradorTexto(ComponenteGrafico componente, String texto) {
        super(componente);
        this.texto = texto;
    }

    @Override
    public void dibujar() {
        super.dibujar();
        System.out.println("    Texto: " + texto);
    }
    
}
