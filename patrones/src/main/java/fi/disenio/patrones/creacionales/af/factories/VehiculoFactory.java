/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package fi.disenio.patrones.creacionales.af.factories;

import fi.disenio.patrones.creacionales.af.auto.Automovil;
import fi.disenio.patrones.creacionales.af.cam.Camioneta;
import fi.disenio.patrones.creacionales.af.motos.Motocicleta;

/**
 *
 * @author jcs
 */
public interface VehiculoFactory {
    Automovil crearAutomovil();
    Camioneta creatCamioneta();
    Motocicleta creatMoto();
}
