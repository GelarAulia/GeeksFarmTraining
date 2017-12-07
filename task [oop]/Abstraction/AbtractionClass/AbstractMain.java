/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AbtractionClass;

/**
 *
 * @author G_Aulia
 */
public class AbstractMain extends AbstractClass{
    public String animalName() {
        return "Lion";
    }
    public int animalAge(int y) {
        return y;
    }
    public static void main(String[] args) {
        AbstractMain abs = new AbstractMain();
        abs.animals();
        System.out.println("Animal name: " + abs.animalName());
        System.out.println("Animal age: " + abs.animalAge(10));
    }
    
}
