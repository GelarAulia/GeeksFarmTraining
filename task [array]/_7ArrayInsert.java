import java.util.*;

public class _7ArrayInsert {
    public static void main(String[] args) {
        List array = new ArrayList();
        array.add("1");
        array.add("2");
        array.add("3");
        array.add("4");
        array.add("5");
        Scanner scan = new Scanner(System.in);
        System.out.print("Input: ");
        String str = scan.next();
        array.add((int)(Math.random() * array.size()), str);
        System.out.println(array);
    }
}