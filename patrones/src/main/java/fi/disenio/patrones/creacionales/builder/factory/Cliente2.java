/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fi.disenio.patrones.creacionales.builder.factory;

import fi.disenio.patrones.creacionales.builder.BuilderAutomovil;

/**
 *
 * @author jcs
 */
public class Cliente2 {
    public static void main(String[] args) {
        BuilderAutomovil ba = BuilderFactory.crearBuilder(TipoBuilder.MANUAL);
    }
}
