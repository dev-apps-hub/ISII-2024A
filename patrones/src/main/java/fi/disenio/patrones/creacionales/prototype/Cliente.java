/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fi.disenio.patrones.creacionales.prototype;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author jcs
 */
public class Cliente {
    public static void main(String[] args) throws CloneNotSupportedException {
        Posicion posicion = new Posicion(10, 20);
        Circulo circulo = new Circulo(5, posicion);
        Cuadrado cuadrado = new Cuadrado(6, posicion);
        
        List<Figura> figuraComp = new ArrayList<>();
        figuraComp.add(circulo);
        figuraComp.add(cuadrado);
        
        
        List<Figura> clon = clonarList(figuraComp);
        
        System.out.println("lista org: " + figuraComp);
        System.out.println("lista clon: " + clon);
    }
    
    public static List<Figura> clonarList(List<Figura> listFiguras) throws CloneNotSupportedException{
        List<Figura> figuraCompClon = new ArrayList<>();
        
        for(Figura figura : listFiguras){
            figuraCompClon.add(figura.clonar());
        }
        
        return figuraCompClon;
    }
}
