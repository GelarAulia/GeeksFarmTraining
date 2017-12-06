import java.util.*;
import java.util.Map.*;

public class _3CapitalCountryNames {
    public static void main(String[] args) {
     	HashMap ceu = new HashMap();
        Set country;
        String countryStr;
        ceu.put("Italy","Rome");
        ceu.put("Luxembourg","Luxembourg");
        ceu.put("Belgium","Brussels");
        ceu.put("Denmark","Copenhagen");
        ceu.put("Finland","Helsinki");
        ceu.put("France","Paris");
        ceu.put("Slovakia","Bratislava");
        ceu.put("Slovenia","Ljubljana");
        ceu.put("Germany","Berlin");
        ceu.put("Greece","Athens");
        ceu.put("Ireland","Dublin");
        ceu.put("Netherlands","Amsterdam");
        ceu.put("Portugal","Lisbon");
        ceu.put("Spain","Madrid");
        ceu.put("Sweden","Stockholm");
        ceu.put("United Kingdom","London");
        ceu.put("Cyprus","Nicosia");
        ceu.put("Lithuania","Vilnius");
        ceu.put("Czech Republic","Prague");
        ceu.put("Estonia","Tallin");
        ceu.put("Hungary","Budapest");
        ceu.put("Latvia","Riga");      
        ceu.put("Malta","Valetta");
        ceu.put("Austria","Vienna");
        ceu.put("Poland","Warsaw");
        country = ceu.entrySet();

        Comparator<Entry> valueComparator = new Comparator<Entry>() { 
           @Override 
           public int compare(Entry e1, Entry e2) { 
               String v1 = (String) e1.getValue(); 
               String v2 = (String) e2.getValue(); 
               return v1.compareTo(v2); 
           } 
       };

        List<Entry> listOfEntries = new ArrayList<Entry>(country);
        Collections.sort(listOfEntries, valueComparator); 
        LinkedHashMap sortedByValue = new LinkedHashMap(listOfEntries.size());

        for(Entry entry : listOfEntries){ 
            sortedByValue.put(entry.getKey(), entry.getValue()); 
        } 
        Set<Entry> entrySetSortedByValue = sortedByValue.entrySet(); 

        for(Entry mapping : entrySetSortedByValue) { 
            System.out.println("The capital of " + mapping.getKey() + " is " + mapping.getValue());
        }
    }
}
