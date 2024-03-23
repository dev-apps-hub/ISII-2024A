/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fi.disenio.patrones.estructural.iterator;

/**
 *
 * @author jcs
 */
public class Cliente {
    public static void main(String[] args) {
        IntegerBox box = new IntegerBox();
        
        for(int i=0; i<=10; i++){
            box.add(i);
        }
        
        IntegerBox.IntegerIterator iterator = box.getIntegerIterator();
        IntegerBox.IntegerIterator iterator2 = box.getIntegerIterator();
        
        for(iterator.first(), iterator2.first(); !iterator.isDone(); iterator.next(), iterator2.next()){
            System.out.println(iterator.currentValue());
            System.out.println("-" +(iterator2.currentValue() + iterator.currentValue()));
        }
        
        
    }
}
