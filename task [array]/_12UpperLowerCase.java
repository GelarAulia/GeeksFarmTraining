import java.util.*;

public class _12UpperLowerCase {
    public static void main(String[] args) {
    	TreeMap color = new TreeMap();
        color.put("A", "Blue");
        color.put("B", "Green");
        color.put("c", "Red");
        //Iterator itr = color.entrySet().iterator();
        color.values().toString().toLowerCase();
        System.out.println(color.entrySet().toString().toLowerCase());
        System.out.println(color.entrySet().toString().toUpperCase());
    }
}