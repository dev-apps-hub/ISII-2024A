/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fi.disenio.patrones.estructural.composite;

/**
 *
 * @author jcs
 */
public class File implements IFile{
    private String nombre;

    public File(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public void list() {
        System.out.println("File: " + nombre);
    }
    
}
