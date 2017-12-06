import java.util.*;
import java.util.Map.*;

public class _5FirstElement {
    public static void main(String[] args) {
    	TreeMap color = new TreeMap();
        color.put(4,"white");
        color.put(6,"green");
        color.put(11,"red");
        System.out.println(color.firstEntry().getValue()); 
    }
}