/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PolymorphismOverride;

/**
 *
 * @author G_Aulia
 */
public class AnimalsBase {
    private final String NAME = "Lion";
    public int age = 10;
    
    public void animalName(){
        System.out.println("Animal name: " + NAME);
    }
    public void animalAge(){
        System.out.println("Animal age: " + age);
    }
}
