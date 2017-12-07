/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HierarchicalInheritance;

/**
 *
 * @author G_Aulia
 */
public class AnimalsMain extends Names{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Ids id = new Ids();
        Names name = new Names();
        Ages age = new Ages();
        id.setId(1);
        name.setName("Lion");
        age.setAge(5);
        System.out.println(" Animal Id: " + id.getId());
        System.out.println(" Animal Name: " + name.getName());
        System.out.println(" Animal Age: " + age.getAge());
    }
    
}
