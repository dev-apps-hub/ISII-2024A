/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fi.disenio.patrones.estructural.decorator;

/**
 *
 * @author jcs
 */
public class Cliente {
    public static void main(String[] args) {
        ComponenteGrafico circulo = new FiguraCirculo(10);
        circulo.dibujar();
        
        ComponenteGrafico boton = new Boton();
        boton.dibujar();
        
        
        ComponenteGrafico circuloDecorado = new DecoradorBorde(new DEcoradorRelleno(circulo, "Rojo"));
        circuloDecorado.dibujar();
        
        ComponenteGrafico botonDecorado = new DecoradorTexto(new DecoradorBorde(new DEcoradorRelleno(boton, "verde")), "Hola");
        botonDecorado.dibujar();
        
    }
}
