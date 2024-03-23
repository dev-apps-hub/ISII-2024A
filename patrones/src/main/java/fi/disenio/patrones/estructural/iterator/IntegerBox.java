/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fi.disenio.patrones.estructural.iterator;


import java.util.*;

/**
 *
 * @author jcs
 */
public class IntegerBox {
    private List<Integer> numeros = new ArrayList<>();
    
    public class IntegerIterator{
        private IntegerBox box;
        private Iterator iterator;
        private int value;

        public IntegerIterator(IntegerBox box) {
            this.box = box;
        }
        
        public void first(){
            iterator = box.numeros.iterator();
            next();
        }
        
        public void next(){
            try{
                value = (Integer) iterator.next();
            }catch(NoSuchElementException ex){
                value = -1;
            }
        }
        
        public boolean isDone(){
            return value == -1;
        }
        
        public int currentValue(){
            return value*1000;
        }
        
    
    }
    
    public void add(int value){
        numeros.add(value);
    }
    
    public IntegerIterator getIntegerIterator(){
        return new IntegerIterator(this);
    }
    
    
}
