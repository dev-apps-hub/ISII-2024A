/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fi.disenio.patrones.estructural.bridge.motor;

/**
 *
 * @author jcs
 */
public class MotorDiesel implements IMotor{

    @Override
    public void arrancarMotor() {
        System.out.println("Inyectar diesel");
        System.out.println("Iniciar comn¡bustion");
    }

    @Override
    public void apagarMotor() {
        System.out.println("detener flujo de diesel");
        System.out.println("detener motor diesel");
    }
    
}
