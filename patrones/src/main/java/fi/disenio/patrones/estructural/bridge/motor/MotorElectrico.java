/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fi.disenio.patrones.estructural.bridge.motor;

/**
 *
 * @author jcs
 */
public class MotorElectrico implements IMotor{

    @Override
    public void arrancarMotor() {
        System.out.println("Iniciado corrriente..");
    }

    @Override
    public void apagarMotor() {
        System.out.println("Detener corrriente..");
    }
    
}
