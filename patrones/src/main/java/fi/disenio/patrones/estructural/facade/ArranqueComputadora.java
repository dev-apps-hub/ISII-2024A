/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fi.disenio.patrones.estructural.facade;

/**
 *
 * @author jcs
 */
public class ArranqueComputadora implements IArranqueDispositivo{
    private Computadora computadora;

    public ArranqueComputadora(Computadora Computadora) {
        this.computadora = Computadora;
    }
    
    

    @Override
    public void iniciar() {
        computadora.iniciarTarjetaMadre();
        computadora.cargarBios();
        computadora.validarDisco();
        computadora.validarMemoria();
        computadora.cargarSO();
        computadora.cargarDrivers();
        computadora.iniciarServicios();
        computadora.presentaUI();
        
    }

    @Override
    public void detener() {
        computadora.cerrarSesiones();
        computadora.detenerServicios();
        computadora.detenerSO();
        computadora.apagarTarjeta();
    }
    
}
