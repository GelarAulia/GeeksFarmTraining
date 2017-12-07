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
public class AnimalsMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        AnimalsBase animBase = new AnimalsBase();
        AnimalsBase animDerv = new AnimalsDerived();
        animBase.animalName();
        animBase.animalAge();
        animDerv.animalAge();
    }
    
}
