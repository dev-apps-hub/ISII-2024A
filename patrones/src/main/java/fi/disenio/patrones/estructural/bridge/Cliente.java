/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fi.disenio.patrones.estructural.bridge;

import fi.disenio.patrones.estructural.bridge.vehiculo.Vehiculo;
import fi.disenio.patrones.estructural.bridge.vehiculo.Automovil;
import fi.disenio.patrones.estructural.bridge.faro.FaroLuzAmarilla;
import fi.disenio.patrones.estructural.bridge.faro.IFaro;
import fi.disenio.patrones.estructural.bridge.motor.IMotor;
import fi.disenio.patrones.estructural.bridge.motor.MotorDiesel;
import fi.disenio.patrones.estructural.bridge.motor.MotorElectrico;
import fi.disenio.patrones.estructural.bridge.motor.MotorGasolina;
import fi.disenio.patrones.estructural.bridge.vehiculo.Motocicleta;

/**
 *
 * @author jcs
 */
public class Cliente {
    public static void main(String[] args) {
        IMotor motorGasolina = new MotorGasolina();
        IMotor motoDisel = new MotorDiesel();
        IMotor motorElectrico = new MotorElectrico();
        IFaro faro = new FaroLuzAmarilla();
        
        Vehiculo auto = new Automovil(motorElectrico, faro);
        auto.arrancarVehiculo();
        auto.encenderrLuces();
        auto.apagarVehiculo();
        
        Vehiculo motocicleta = new Motocicleta(motoDisel, faro);
        motocicleta.arrancarVehiculo();
        motocicleta.encenderrLuces();
        motocicleta.apagarVehiculo();
        
    }
}
