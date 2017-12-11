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
public class VideoGamesVar {
    //Encapsulation
    private String gameName; 
    private int gamePrice;
    private String gamePublisher;
    //Polymorphism
    public VideoGamesVar() {
        
    }
    
    public VideoGamesVar(String name, int price, String publisher) { 
        this.gameName = name;
        this.gamePrice = price;
        this.gamePublisher = publisher;
    }
    
    /**Get variable value without accessing variable itself 
     * @return string name value*/
    public String getName(){ 
        return this.gameName;
    }
    /**Get variable value without accessing variable itself 
     * @return integer price value*/
    public int getPrice(){
        return this.gamePrice;
    }
    /**Get variable value without accessing variable itself 
     * @return string publisher name value*/
    public String getPublisher(){
        return this.gamePublisher;
    }
}
