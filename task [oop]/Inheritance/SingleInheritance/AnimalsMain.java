/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SingleInheritance;

/**
 *
 * @author G_Aulia
 */
public class AnimalsMain extends AnimalsNames{
    private int id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        AnimalsMain anim = new AnimalsMain();
        anim.setId(1);
        anim.setName("Lion");
        System.out.println(" Animal Id: " + anim.getId() + ", Name: " + anim.getName());
    }
    
}
