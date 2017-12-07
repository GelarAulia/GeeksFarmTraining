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
public class AnimalsOverloadMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        AnimalsOverload animOver = new AnimalsOverload();
        animOver.animal("Lion");
        animOver.animal("Lion",10);
    }
    
}
