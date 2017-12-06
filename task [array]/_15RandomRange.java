import java.util.*;

public class _15RandomRange {
    public static void main(String[] args) {
    	Scanner scan = new Scanner(System.in);
        System.out.print("Min range: ");
        int min = scan.nextInt();
        System.out.print("Max range: ");
        int max = scan.nextInt();
        int num;
        int range = max - min + 1;
        System.out.println("Random number in range: ");
        for (int x = 0; x < range; x++) {
            num = (int)(Math.random() * range) + min;
            System.out.println(num);
        }
    }
}