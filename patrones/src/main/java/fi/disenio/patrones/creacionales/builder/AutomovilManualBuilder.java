/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fi.disenio.patrones.creacionales.builder;

/**
 *
 * @author jcs
 */
public class AutomovilManualBuilder extends BuilderAutomovil{

    @Override
    public void buildChasis() {
        automovil.setTipoAutomovil("Manual");
    }

    @Override
    public void buildCarroceria() {
        automovil.setTipoCarroceria("Acero..");

    }

    @Override
    public void buildMotor() {
        automovil.setTipoMotor("Motor electrico");
    }

    @Override
    public void buildAccesorios() {
        automovil.setTipoFaros("faros luz blanca..");

    }

    @Override
    public void pintar() {
        automovil.setColor("rojo");
    }

    @Override
    public void buldTapiceria() {
        automovil.setTipoTapiceria("piel");

    }
    
}
