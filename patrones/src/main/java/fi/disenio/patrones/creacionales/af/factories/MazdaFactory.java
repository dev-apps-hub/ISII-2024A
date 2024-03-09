/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fi.disenio.patrones.creacionales.af.factories;

import fi.disenio.patrones.creacionales.af.auto.Automovil;
import fi.disenio.patrones.creacionales.af.auto.AutomovilMazda;
import fi.disenio.patrones.creacionales.af.cam.Camioneta;
import fi.disenio.patrones.creacionales.af.cam.CamionetaMazda;
import fi.disenio.patrones.creacionales.af.motos.MotoMazda;
import fi.disenio.patrones.creacionales.af.motos.Motocicleta;

/**
 *
 * @author jcs
 */
public class MazdaFactory implements VehiculoFactory{

    @Override
    public Automovil crearAutomovil() {
        return new AutomovilMazda();
    }

    @Override
    public Camioneta creatCamioneta() {
        return new CamionetaMazda();
    }

    @Override
    public Motocicleta creatMoto() {
        return new MotoMazda();
    }
    
}
