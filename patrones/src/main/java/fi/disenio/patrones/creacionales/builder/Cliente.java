/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fi.disenio.patrones.creacionales.builder;

/**
 *
 * @author jcs
 */
public class Cliente {
    public static void main(String[] args) {
        Supervisor supervisor = new Supervisor();
        BuilderAutomovil manual = new AutomovilManualBuilder();
        BuilderAutomovil automatico = new AutomovilAutomaticoBuilder();
        
        
        supervisor.setBuilder(manual);
        Automovil autoManual = supervisor.crearAutomovil();
        System.out.println(autoManual);
        
        supervisor.setBuilder(automatico);
        Automovil autoAutomatico = supervisor.crearAutomovil();
        System.out.println(autoAutomatico);
        
    }
}
