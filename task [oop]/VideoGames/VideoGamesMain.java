package VideoGames;

import java.util.Scanner;

/**
 *
 * @author G_Aulia
 */
public class VideoGamesMain implements IDiscount{
    //Abstraction Methods
    @Override
    public void discount(int price, double disc) {
        if (disc >= 1) {
            discount(price,(int)disc);
        } else {
            double total = price - (price * disc);
            System.out.println("Video game price after " + (int)(disc*100) + 
                    "% discount: Rp. " + total);
        }
    }
    @Override
    public void discount(int price, int disc) {
        double total = price - (price * ((double)disc/100));
        System.out.println("Video game price after " + disc + 
                "% discount: Rp. " + total);
    }
    
    public static void main(String[] args) {
        //Instance
        VideoGames games = new VideoGames("Grand Theft Auto 5", 500000, "Rockstar Games");
        System.out.println("Video game name: " + games.getName());
        System.out.println("Video game price: " + games.getPrice());
        System.out.println("Video game publisher: " + games.getPublisher());
        //Instance
        VideoGamesMain gamesMain = new VideoGamesMain();
        gamesMain.discount(games.getPrice(), 0.30);
        gamesMain.discount(games.getPrice(), 40);
        gamesMain.discount(games.getPrice(), 50.0);
        Scanner scan = new Scanner(System.in);
        double db = scan.nextDouble();
        gamesMain.discount(games.getPrice(), db);
    }

    
    
}
