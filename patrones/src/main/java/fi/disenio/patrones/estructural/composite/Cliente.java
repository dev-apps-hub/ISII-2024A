/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fi.disenio.patrones.estructural.composite;

/**
 *
 * @author jcs
 */
public class Cliente {
    public static void main(String[] args) {
        Directory root = new Directory("c:");
        Directory docs = new Directory("Documents");
        Directory music = new Directory("Music");
        Directory downloads = new Directory("Downloads");
        
        root.addHijo(docs);
        root.addHijo(downloads);
        
        docs.addHijo(music);
        
        IFile pdf = new File("patrones.pdf");
        IFile cancion = new File("rock.mp3");
        IFile app = new File("office.exe");
        
        docs.addHijo(pdf);
        music.addHijo(cancion);
        downloads.addHijo(app);
        
        root.list();
        
    }
}
