/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fi.disenio.patrones.creacionales.af;

import fi.disenio.patrones.creacionales.af.auto.Automovil;
import fi.disenio.patrones.creacionales.af.cam.Camioneta;
import fi.disenio.patrones.creacionales.af.factories.FabricaVehiculoFactory;
import fi.disenio.patrones.creacionales.af.factories.Marca;
import fi.disenio.patrones.creacionales.af.factories.VehiculoFactory;
import fi.disenio.patrones.creacionales.af.motos.Motocicleta;

/**
 *
 * @author jcs
 */
public class Cliente {
    public static void main(String[] args) {
        VehiculoFactory mazdaFactory = FabricaVehiculoFactory.getVehiculoFactory(Marca.MAZDA);
        Automovil mzd3 = mazdaFactory.crearAutomovil();
        Camioneta cx6 = mazdaFactory.creatCamioneta();
        Motocicleta mzd = mazdaFactory.creatMoto();
        
        System.out.println(mzd3);
        System.out.println(cx6);
        
        VehiculoFactory toyoFactory = FabricaVehiculoFactory.getVehiculoFactory(Marca.TOYOTA);
        Automovil corolla = toyoFactory.crearAutomovil();
        Camioneta hiulux = toyoFactory.creatCamioneta();
        Motocicleta motoT = toyoFactory.creatMoto();
        
        System.out.println(corolla);
        System.out.println(hiulux);
        
    }
}
