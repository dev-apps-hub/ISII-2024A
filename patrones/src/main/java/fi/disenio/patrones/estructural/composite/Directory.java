/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fi.disenio.patrones.estructural.composite;

import java.util.*;

/**
 *
 * @author jcs
 */
public class Directory implements IFile{
    private String nombre;
    private List<IFile> hijos = new ArrayList<>();

    public Directory(String nombre) {
        this.nombre = nombre;
    }
    
    @Override
    public void list() {
        System.out.println("Directory: " + nombre);
        for(IFile iFile : hijos){
            iFile.list();
        }
    }
    
    public void addHijo(IFile iFile){
        hijos.add(iFile);
    }
    
}
