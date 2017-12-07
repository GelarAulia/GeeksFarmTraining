/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MultilevelInheritance;

/**
 *
 * @author G_Aulia
 */
public class AnimalsMain extends AnimalsAge{

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        AnimalsMain anim = new AnimalsMain();
        anim.setId(1);
        anim.setName("Lion");
        anim.setAge(5);
        System.out.println(" Animal Id: " + anim.getId());
        System.out.println(" Animal Name: " + anim.getName());
        System.out.println(" Animal Age: " + anim.getAge());
    }
    
}
