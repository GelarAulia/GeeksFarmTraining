package VideoGames;

import java.util.Scanner;

/**
 *
 * @author G_Aulia
 */
//Inheritance
public class VideoGamesMain extends Discount{
/**    //Abstraction Methods
     * @param args
*    @Override
*    public void discount(int a, double b) {
*        if (b >= 1) {
*            discount(a,(int)b);
*        } else {
*            double total = a - (a * b);
*            System.out.println("Video game price after " + (int)(b*100) + "% discount: Rp. " + total);
*        }
*    }
*    @Override
*    public void discount(int c, int d) {
*        double total = c - (c * ((double)d/100));
*        System.out.println("Video game price after " + d + "% discount: Rp. " + total);
*    }
*/    
    public static void main(String[] args) {
        //Instance
        VideoGamesVar games = new VideoGamesVar("Grand Theft Auto 5", 500000, "Rockstar Games");
        System.out.println("Video game name: " + games.getName());
        System.out.println("Video game price: " + games.getPrice());
        System.out.println("Video game publisher: " + games.getPublisher());
        //Instance
        VideoGamesMain gamesMain = new VideoGamesMain();
        gamesMain.discount(games.getPrice(), 0.30);
        gamesMain.discount(games.getPrice(), 40);
        gamesMain.discount(games.getPrice(), 50.0);
        Scanner scan = new Scanner(System.in);
        for (int x = 0; x < 1;) {
            double db = scan.nextDouble();
            gamesMain.discount(games.getPrice(), db);
        }
    }  
}
