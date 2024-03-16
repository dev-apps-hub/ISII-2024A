/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fi.disenio.patrones.estructural.bridge.motor;

/**
 *
 * @author jcs
 */
public class MotorGasolina implements IMotor{

    @Override
    public void arrancarMotor() {
        System.out.println("Iniciar chispa");
        System.out.println("Inyectar gasolina");
        System.out.println("Iniciar combation");
        
    }

    @Override
    public void apagarMotor() {
        System.out.println("detener flujo de gasolina");
        System.out.println("detener motor...");
    }
    
}
