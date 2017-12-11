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
public class Discount implements IDiscount{
    //Abstraction Methods
    /** Calculate the discount value from the inputed price and sale value
     * @param a the inputed price
     * @param b the inputed sale value in double*/
    @Override
    public void discount(int a, double b) {
        if (b >= 1) {
            discount(a,(int)b);
        } else {
            double total = a - (a * b);
            System.out.println("Video game price after " + (int)(b*100) + "% discount: Rp. " + total);
        }
    }
    /** Calculate the discount value from the inputed price and sale value
     * @param c the inputed price
     * @param d the inputed sale value in integer*/
    @Override
    public void discount(int c, int d) {
        double total = c - (c * ((double)d/100));
        System.out.println("Video game price after " + d + "% discount: Rp. " + total);
    }
}
