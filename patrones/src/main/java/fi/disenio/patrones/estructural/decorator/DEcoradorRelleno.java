/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fi.disenio.patrones.estructural.decorator;

/**
 *
 * @author jcs
 */
public class DEcoradorRelleno extends Decorador{
    private String color;
    
    public DEcoradorRelleno(ComponenteGrafico componente,
            String color) {
        super(componente);
        this.color = color;
    }
    
    @Override
    public void dibujar() {
        super.dibujar();
        System.out.println("    Rellenar color " + color);
    }
    
}
