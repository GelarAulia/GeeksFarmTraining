/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClassAndInstance;

/**
 *
 * @author G_Aulia
 */
public class WeightClassifMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        WeightClassification weightClass = new WeightClassification();
        weightClass.weight = WeightClassification.WeightNames.SKINNY;
        System.out.println(weightClass.weight);
    }
    
}
