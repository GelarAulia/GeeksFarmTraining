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
public class AnimalsDerived extends AnimalsBase{
    public void animalAge(){
        age = 15;
        System.out.println("Animal age: " + age);
    }
}
