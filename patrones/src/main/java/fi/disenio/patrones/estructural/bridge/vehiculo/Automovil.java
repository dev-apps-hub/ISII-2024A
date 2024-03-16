/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fi.disenio.patrones.estructural.bridge.vehiculo;

import fi.disenio.patrones.estructural.bridge.faro.IFaro;
import fi.disenio.patrones.estructural.bridge.motor.IMotor;

/**
 *
 * @author jcs
 */
public class Automovil extends Vehiculo{
    
    public Automovil(IMotor motor, IFaro faro) {
        super(motor, faro);
    }

    @Override
    public void arrancarVehiculo() {
        motor.arrancarMotor();
    }

    @Override
    public void apagarVehiculo() {
        motor.apagarMotor();
    }

    @Override
    public void encenderrLuces() {
        faro.encenderFaro();
    }

    public IMotor getMotor() {
        return motor;
    }

    public void setMotor(IMotor motor) {
        this.motor = motor;
    }

    public IFaro getFaro() {
        return faro;
    }

    public void setFaro(IFaro faro) {
        this.faro = faro;
    }
    
    
    
}
