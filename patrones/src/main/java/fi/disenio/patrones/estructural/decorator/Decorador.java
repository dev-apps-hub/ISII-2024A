/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fi.disenio.patrones.estructural.decorator;

/**
 *
 * @author jcs
 */
public abstract class Decorador implements ComponenteGrafico{
    private ComponenteGrafico componente;

    public Decorador(ComponenteGrafico componente) {
        this.componente = componente;
    }
    
    
    
    @Override
    public void dibujar() {
        componente.dibujar();
    }
}
