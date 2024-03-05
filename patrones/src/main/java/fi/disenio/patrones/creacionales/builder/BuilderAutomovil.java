/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fi.disenio.patrones.creacionales.builder;

/**
 *
 * @author jcs
 */
public abstract class BuilderAutomovil {
    protected Automovil automovil;
    
    public void crearAutomovil(){
        automovil = new Automovil();
    }
    
    public abstract void buildChasis();
    public abstract void buildCarroceria();
    public abstract void buildMotor();
    public abstract void buildAccesorios();
    public abstract void pintar();
    public abstract void buldTapiceria();
    
    public Automovil getAutomovil(){
        return automovil;
    }
    
    
}
