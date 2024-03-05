/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fi.disenio.patrones.creacionales.builder;

/**
 *
 * @author jcs
 */
public class Supervisor {
    private BuilderAutomovil builder;
    
    
    public Automovil crearAutomovil(){
        builder.crearAutomovil();
        builder.buildChasis();
        builder.buildCarroceria();
        builder.buildMotor();
        builder.pintar();
        builder.buildAccesorios();
        builder.buldTapiceria();
        
        return builder.getAutomovil();
    }
    

    public BuilderAutomovil getBuilder() {
        return builder;
    }

    public void setBuilder(BuilderAutomovil builder) {
        this.builder = builder;
    }
    
    
    
}
