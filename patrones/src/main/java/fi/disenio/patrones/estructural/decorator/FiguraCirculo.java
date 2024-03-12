/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fi.disenio.patrones.estructural.decorator;

/**
 *
 * @author jcs
 */
public class FiguraCirculo implements ComponenteGrafico{
    private int radio;

    public FiguraCirculo(int radio) {
        this.radio = radio;
    }
    
    

    @Override
    public void dibujar() {
        System.out.println("Circulo- radio: " + radio );
    }
    
}
