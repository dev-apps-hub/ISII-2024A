/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fi.disenio.patrones.creacionales.builder;

/**
 *
 * @author jcs
 */
public class AutomovilAutomaticoBuilder extends BuilderAutomovil{

    @Override
    public void buildChasis() {
        automovil.setTipoAutomovil("Automatico");
    }

    @Override
    public void buildCarroceria() {
        automovil.setTipoCarroceria("Fibra Vidrio");
    }

    @Override
    public void buildMotor() {
        automovil.setTipoMotor("Motor gasolina");
    }

    @Override
    public void buildAccesorios() {
        automovil.setTipoFaros("faros niebla..");
    }

    @Override
    public void pintar() {
        automovil.setColor("azul");
    }

    @Override
    public void buldTapiceria() {
        automovil.setTipoTapiceria("tela");
    }
    
}
