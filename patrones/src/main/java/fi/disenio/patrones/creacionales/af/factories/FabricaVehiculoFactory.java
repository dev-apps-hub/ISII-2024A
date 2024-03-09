/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fi.disenio.patrones.creacionales.af.factories;

/**
 *
 * @author jcs
 */
public class FabricaVehiculoFactory {
    
    private FabricaVehiculoFactory(){}
    
    
    public static VehiculoFactory getVehiculoFactory(Marca nombreFabrica){
        switch (nombreFabrica) {
            case MAZDA:
                return new MazdaFactory();
            case TOYOTA: 
                return new ToyotaFactory();
            default:
                return null;
        }
    }
}
