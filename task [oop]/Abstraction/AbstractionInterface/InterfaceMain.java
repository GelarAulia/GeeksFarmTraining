/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AbstractionInterface;

/**
 *
 * @author G_Aulia
 */
public class InterfaceMain implements Interface{
    @Override
    public void animalName(){
            System.out.println("Animal name: Lion");
    }
    public void animalAge(){
            System.out.println("Animal age: 10");
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Interface interf = new InterfaceMain();
        interf.animalName();
        interf.animalAge();
    }
    
}
