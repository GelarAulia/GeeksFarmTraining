/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PolymorphismOverload;

/**
 *
 * @author G_Aulia
 */
public class AnimalsOverload {
    public void animal(String x){
        System.out.println("Animal name: " + x);
    }
    public void animal(String x,int y){
        System.out.println("Animal name: " + x + ", with age: " + y);
    }
    
    
}
