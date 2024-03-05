/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fi.disenio.patrones.creacionales.builder.factory;

import fi.disenio.patrones.creacionales.builder.AutomovilAutomaticoBuilder;
import fi.disenio.patrones.creacionales.builder.AutomovilManualBuilder;
import fi.disenio.patrones.creacionales.builder.BuilderAutomovil;

/**
 *
 * @author jcs
 */
public class BuilderFactory {
    public static BuilderAutomovil crearBuilder(TipoBuilder tipoBuilder){
        switch (tipoBuilder) {
            case AUTOMATICO:
                return new AutomovilAutomaticoBuilder();
            case MANUAL:
                return new AutomovilManualBuilder();
            default:
                System.err.println("Tipo de build no valido");
                return null;
        }
    }
}
