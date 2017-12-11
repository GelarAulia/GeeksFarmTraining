/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package VideoGames;

/**
 *
 * @author G_Aulia
 */
//Abstraction
public interface IDiscount {
    //Polymorphism
    public void discount(int price, double sale);
    public void discount(int price, int sale);
}
