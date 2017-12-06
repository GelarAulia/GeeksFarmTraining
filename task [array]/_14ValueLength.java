import java.util.*;

public class _14ValueLength {
    public static void main(String[] args) {
    	List<String> array = new ArrayList<String>();
        array.add("abcd");
        array.add("abc");
        array.add("de");
        array.add("hjjj");
        array.add("g");
        array.add("wer");
        String value1, value2 = "", shortest = "", longest = "";
        for (int x = 0; x < array.size(); x++) {
            value1 = array.get(x);
            if (value1.length()>value2.length()) {
                value2 = value1;
                longest = value2;
            }
        }
        for (int x = 0; x < array.size(); x++) {
            value1 = array.get(x);
            if (value1.length()<value2.length()) {
                value2 = value1;
                shortest = value2;
            }
        }
        
        System.out.println("Sample arrays: " + array.subList(0, array.size()));
        System.out.println("The shortest array length is " + shortest.length() + ". The longest " + 
                "array length is " + longest.length() + ".");
    }
}