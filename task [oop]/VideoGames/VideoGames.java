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
//Inheritance
class VideoGames extends VideoGamesVar{
    public VideoGames() {
        
    }
    //Polymorphism
    public VideoGames(String name, int price, String publisher) {
        this.name = name;
        this.price = price;
        this.publisher = publisher;
    }
    
    public String getName(){
        return this.name;
    }
    
    public int getPrice(){
        return this.price;
    }
    
    public String getPublisher(){
        return this.publisher;
    }
}
