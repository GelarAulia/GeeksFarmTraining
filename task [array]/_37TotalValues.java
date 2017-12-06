import java.util.*;

public class _37TotalValues {
    public static void main(String[] args) {
    	String[] array = {"a","a","b","c","c","c"};
        int y = 0;
        Scanner scan = new Scanner(System.in);
        System.out.println("Array values: " + Arrays.toString(array));
        System.out.print("Input: ");
        String input = scan.next().toLowerCase();
        for (int x = 0; x < array.length; x++) {
            if (array[x].contains(input)) {
                y++;
            }
        }
        System.out.println("total number of times a value appears: " + y);
    }
}