/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fi.disenio.patrones.estructural.decorator;

/**
 *
 * @author jcs
 */
public class DecoradorBorde extends Decorador{

    public DecoradorBorde(ComponenteGrafico componente) {
        super(componente);
    }
    @Override
    public void dibujar() {
        super.dibujar();
        System.out.println("    Borde decorado");
    }
}
