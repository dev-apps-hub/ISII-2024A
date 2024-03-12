/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fi.disenio.patrones.estructural.facade;

/**
 *
 * @author jcs
 */
public class Computadora {
    
    
    public void iniciarTarjetaMadre(){
        System.out.println("Inicio de tarjeta");
    }
    
    public void cargarBios(){
        System.out.println("bios cargado");
    }
    
    public void validarMemoria(){
        System.out.println("memoria OK");
    }
    
    public void validarDisco(){
        System.out.println("disco OK");
    }
    
    public void cargarSO(){
        System.out.println("SO OK");
    }
    
    public void cargarDrivers(){
        System.out.println("drivers OK");
    }
    
    public void iniciarServicios(){
        System.out.println("servicios OK");
    }
    
    public void presentaUI(){
        System.out.println("UI OK");
    }
    
    
    
    public void cerrarSesiones(){
        System.out.println("sesiosnes cerradas");
    }
    
    public void detenerServicios(){
        System.out.println("servcios stop");
    }
    
    public void detenerSO(){
        System.out.println("SO off");
    }
    
    public void apagarTarjeta(){
        System.out.println("tarjeta off");
    }
    
}
