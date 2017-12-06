import java.util.*;
import java.util.Map.*;

public class _8AscendDescend {
    public static void main(String[] args) {
    	Map arrayPeople = new TreeMap();
        Set entrySet;
        String countryStr;
        arrayPeople.put("Sophia","31");
        arrayPeople.put("Jacob","41");
        arrayPeople.put("William","39");
        arrayPeople.put("Ramesh","40");
        System.out.println("Ascending keys: " + arrayPeople);
        
        Map<String, String> arrayPeopleDes = new TreeMap(Collections.reverseOrder());
        arrayPeopleDes.putAll(arrayPeople);
        System.out.println("Descending keys: " + arrayPeopleDes);
        
        SortedSet<Map.Entry<String,String>> sortedEntries = new TreeSet<Map.Entry<String,String>>(
            new Comparator<Map.Entry<String,String>>() {
                @Override public int compare(Map.Entry<String,String> e1, Map.Entry<String,String> e2) {
                    int res = e1.getValue().compareTo(e2.getValue());
                    return res != 0 ? res : 1;
                }
            }
        );
        sortedEntries.addAll(arrayPeople.entrySet());
        System.out.println("Ascending values: " + sortedEntries);
        
        SortedSet<Map.Entry<String,String>> sortedEntriesDes = new TreeSet<Map.Entry<String,String>>(Collections.reverseOrder());
        sortedEntriesDes.addAll(sortedEntries);
        System.out.println("Descending values: " + sortedEntriesDes);
    }
}