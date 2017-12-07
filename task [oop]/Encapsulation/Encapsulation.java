/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Encapsulation;

import java.util.*;

/**
 *
 * @author G_Aulia
 */
public class Encapsulation {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Animals animal = new Animals();
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter id: ");
        animal.setId(scan.nextInt());
        System.out.print("Enter name: ");
        animal.setName(scan.next());
        System.out.print("Enter age: ");
        animal.setAge(scan.nextInt());
        
        System.out.println("Animal id: " + animal.getId());
        System.out.println("Animal name: " + animal.getName());
        System.out.println("Animal age: " + animal.getAge());
    }
    
}
