/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package fi.disenio.patrones.estructural.bridge.vehiculo;

import fi.disenio.patrones.estructural.bridge.faro.IFaro;
import fi.disenio.patrones.estructural.bridge.motor.IMotor;
/**
 *
 * @author jcs
 */
public abstract class Vehiculo {
    protected IMotor motor;
    protected IFaro faro;

    public Vehiculo(IMotor motor, IFaro faro) {
        this.motor = motor;
        this.faro = faro;
    }
    
    

    public abstract void arrancarVehiculo();
    public abstract void apagarVehiculo();
    public abstract void encenderrLuces();
    
    
}



