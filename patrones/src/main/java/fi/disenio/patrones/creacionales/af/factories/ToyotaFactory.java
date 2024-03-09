/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fi.disenio.patrones.creacionales.af.factories;

import fi.disenio.patrones.creacionales.af.auto.Automovil;
import fi.disenio.patrones.creacionales.af.auto.AutomovilToyota;
import fi.disenio.patrones.creacionales.af.cam.Camioneta;
import fi.disenio.patrones.creacionales.af.cam.CamionetaToyota;
import fi.disenio.patrones.creacionales.af.motos.MotoToyota;
import fi.disenio.patrones.creacionales.af.motos.Motocicleta;

/**
 *
 * @author jcs
 */
public class ToyotaFactory implements VehiculoFactory{

    @Override
    public Automovil crearAutomovil() {
        return new AutomovilToyota();
    }

    @Override
    public Camioneta creatCamioneta() {
        return new CamionetaToyota();
    }

    @Override
    public Motocicleta creatMoto() {
        return new MotoToyota();
    }
    
}
