/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HybridInheritance;

/**
 *
 * @author G_Aulia
 */
public class AnimalsMain implements AnimalsNames, AnimalsAge{
    
    @Override 
    public void Id() {
        System.out.println("Animal id: 1");
    }
    @Override
    public void Name() {
        System.out.println("Animal name: Lion");
    }
    @Override
    public void Age() {
        System.out.println("Animal age: 10");
    }
    public static void main(String[] args) {
        AnimalsMain anim = new AnimalsMain();
        anim.Id();
        anim.Name();
        anim.Age();
    }
    
}
